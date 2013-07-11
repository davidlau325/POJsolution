import java.io.*;
import java.util.*;

public class Main{
	static String f(String s1,String s2){
		if(s1.length()==1){return s1;}
		else if(s1.length()==0){return "";}
		else{
		System.out.println(s2+" "+s1);
			int m = s1.indexOf(s2.substring(0,1));
		return f(s1.substring(0,m),s2.substring(1,m+1))+f(s1.substring(m+1),s2.substring(m+1))+s2.substring(0,1);
		}
	}

	public static void main(String[] args)throws Exception{
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	String read,s1,s2;
	StringTokenizer idata;
	char[] check;
	while((read=buffer.readLine())!=null){
		idata = new StringTokenizer(read);
		s1 = idata.nextToken();
		s2 = idata.nextToken();
		System.out.println(f(s2,s1));
	}
	buffer.close();
}
}
