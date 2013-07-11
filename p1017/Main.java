import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws Exception{
	BufferedReader buffer=new BufferedReader(new
InputStreamReader(System.in));

	String read;
	StringTokenizer idata;	
	int[] u={0,5,3,1};
	int a,b,c,d,e,f;
	int total,total2,total1;
	while(!(read=buffer.readLine()).equals("0 0 0 0 0 0")){
		idata=new StringTokenizer(read);
		a=Integer.parseInt(idata.nextToken());
		b=Integer.parseInt(idata.nextToken());
		c=Integer.parseInt(idata.nextToken());
		d=Integer.parseInt(idata.nextToken());
		e=Integer.parseInt(idata.nextToken());
		f=Integer.parseInt(idata.nextToken());
		total=f+e+d+((c+3)/4);
		
		total2=5*d+u[c%4];
		if(b>total2){ total+=((b-total2+8)/9);}
		total1=36*total-36*f-25*e-16*d-9*c-4*b;
		if(a>total1){ total+=((a-total1+35)/36);}
		System.out.println(total);
	}
	buffer.close();
}
}
