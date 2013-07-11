import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws Exception{
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

	String read1,read2;
	char[] read1Char;
	char[] read2Char;
	
	while((read2 = buffer.readLine())!=null){
	read1 = buffer.readLine();
	
	read1Char = read1.toCharArray();
	read2Char = read2.toCharArray();
	
	if(read1Char.length> read2Char.length || read1Char.length<read2Char.length){
		System.out.println("NO");
		System.exit(0);
	}
	int[] read1Alpha = new int[26];
	int[] read2Alpha = new int[26];
	Arrays.fill(read1Alpha,0);
	Arrays.fill(read2Alpha,0);
	for(int i=0;i<read1Char.length;i++){
		read1Alpha[(read1Char[i]-'A')]++;
		read2Alpha[(read2Char[i]-'A')]++;
	}

	Arrays.sort(read1Alpha);
	Arrays.sort(read2Alpha);
	if(Arrays.equals(read1Alpha,read2Alpha)){
		System.out.println("YES");
	}else{
		System.out.println("NO");
	}
	}
	buffer.close();
}
}
