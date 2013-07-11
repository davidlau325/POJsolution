import java.io.*;
import java.util.*;
import java.math.*;

public class Main{
	public static void main(String[] args)throws Exception{
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	String read;
	StringTokenizer idata;
	double n,p;
	while((read=buffer.readLine())!=null){
		idata=new StringTokenizer(read);
		n = Double.parseDouble(idata.nextToken());
		p = Double.parseDouble(idata.nextToken());
		System.out.printf("%.0f\n",Math.pow(p,1/n));
	}
	buffer.close();
}
}
