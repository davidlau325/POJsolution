import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws Exception{
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

	String read;
	StringTokenizer idata;
	read = buffer.readLine();
	idata = new StringTokenizer(read);
	int a,b;
	a=Integer.parseInt(idata.nextToken());
	b=Integer.parseInt(idata.nextToken());
	System.out.println((a+b));
	buffer.close();
}
}
