import java.io.*;
import java.util.*;

public class Main{
	static String revS(String input){
	return new StringBuffer(input).reverse().toString();
	}
	public static void main(String[] args)throws Exception{
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	String read;
	int[] acc = new int[107];
	Arrays.fill(acc,0);
	char[] temp;
	int i;
	int extra,addup;
	StringBuffer sb;
	while(!(read=buffer.readLine()).equals("0")){
		read = revS(read);
		temp = read.toCharArray();
		extra=0;
		addup=0;
		for(i=0;i<temp.length;i++){
			extra=(acc[i]+(temp[i]-'0')+addup);
			if(extra>9){
				acc[i]=(extra-10);
				addup=1;
			}else{
			acc[i]+=((temp[i]-'0')+addup);
			addup=0;
			}
		}
		if(addup==1){
			acc[i]++;
		}
	}
	sb = new StringBuffer();
	for(i=(acc.length-1);i>-1;i--){
		sb.append(acc[i]);
	}
	String output = sb.toString().replaceAll("^0*","");
	System.out.println(output);
	buffer.close();
}
}
