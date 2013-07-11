import java.io.*;
import java.util.*;
import java.math.*;

public class Main{
	static double computeDistance(double x1,double x2,double y1,double y2){
		double a = Math.pow((x2-x1),2);
		double b = Math.pow((y2-y1),2);	
	
		return Math.sqrt(a+b); 
	}
	static double computeAngle(double a,double b,double c){
		double cosc = (Math.pow(a,2)+Math.pow(b,2)-Math.pow(c,2))/(2*a*b);
		return Math.acos(cosc);
	}

	public static void main(String[] args)throws Exception{
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

	String read;
	StringTokenizer idata;
	double x1,y1,x2,y2,x3,y3,triSize;
	double a,b,c;
	while((read = buffer.readLine())!=null){
		idata = new StringTokenizer(read);
		x1 = Double.parseDouble(idata.nextToken());
		y1 = Double.parseDouble(idata.nextToken());
		x2 = Double.parseDouble(idata.nextToken());
		y2 = Double.parseDouble(idata.nextToken());
		x3 = Double.parseDouble(idata.nextToken());
		y3 = Double.parseDouble(idata.nextToken());

		a = computeDistance(x1,x2,y1,y2);
		b = computeDistance(x2,x3,y2,y3);
		c = computeDistance(x3,x1,y3,y1);

		double cosA = computeAngle(b,c,a);
		System.out.printf("%.2f",a*Math.PI/Math.sin(cosA)); 
		System.out.println("");
	}
	buffer.close();
}
}
