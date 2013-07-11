import java.io.*;
import java.util.*;
import java.math.*;

public class Main{
	public static void main(String[] args)throws Exception{
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	int scene;
	scene = Integer.parseInt(buffer.readLine());
	String read;
	StringTokenizer idata;
	double R,r,angle;
	int n;
	for(int i=0;i<scene;i++){
		read=buffer.readLine();
		idata = new StringTokenizer(read);
		R = Double.parseDouble(idata.nextToken());
		n = Integer.parseInt(idata.nextToken());
		angle =(double)(Math.PI/n);
		r = (R*Math.sin(angle))/(1+Math.sin(angle));
		System.out.println("Scenario #"+(i+1)+":");
		System.out.printf("%.3f\n\n",r);	
	}
	buffer.close();	
	}
}
