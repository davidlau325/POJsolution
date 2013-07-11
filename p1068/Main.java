import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws Exception{
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

	int testcase,n;
	testcase = Integer.parseInt(buffer.readLine());
	String read;
	StringTokenizer idata;
	int[] S = new int[200];
	int count,pos;
	for(int i=0;i<testcase;i++){
		n = Integer.parseInt(buffer.readLine());
		Arrays.fill(S,1);
		S[0]=0;
		read = buffer.readLine();
		idata = new StringTokenizer(read);
		for(int j=1;j<=n;j++){
			pos = Integer.parseInt(idata.nextToken());
			S[pos+j]=0;
			count=1;
			for(int k=(pos+j-1);k>0;k--){
				if(S[k]==1){
				System.out.print(count+" ");
				S[k]=2;
				break;
				}
				if(S[k]==2){count++;}
			}
		}
	System.out.println();
	}
	buffer.close();
}
}
