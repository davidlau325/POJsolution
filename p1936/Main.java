import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws Exception{
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	String read;
	char[] s1;
	char[] s2;
	StringTokenizer idata;
	int i,j;
	while((read=buffer.readLine())!=null){
		idata = new StringTokenizer(read);
		s1=idata.nextToken().toCharArray();
		s2=idata.nextToken().toCharArray();
		i=0;
		j=0;
		while(i<s2.length){
			if(s2[i]==s1[j]){
			j++;
			}	
			if(j==s1.length){
			break;
			}
		i++;
		}
		if(j==s1.length){
		System.out.println("Yes");
		}else{
		System.out.println("No");
		}
	}
	buffer.close();
}
}
