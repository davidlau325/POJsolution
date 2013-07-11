import java.io.*;
import java.util.*;
import java.math.*;

public class Main{
	public static void main(String[] args)throws Exception{
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

	String riders,read,readSpeed,readStart;
	double smallest;
	double rideSpeed,rideStart,time;
	int riderInt;
	while(!(riders = buffer.readLine()).equals("0")){
		smallest=-1;
		riderInt = Integer.parseInt(riders);
		for(int i=0;i<riderInt;i++){
			read = buffer.readLine();
		readSpeed = read.substring(0,2);
		readSpeed=readSpeed.trim();
		readStart = read.substring(2);
		readStart=readStart.trim();
		rideSpeed =Double.parseDouble(readSpeed);	
		rideStart =Double.parseDouble(readStart);
		
			if(rideStart>-1){		
			rideSpeed=rideSpeed*1000/3600;
			time = 4500/rideSpeed + rideStart;
			if(smallest==-1){smallest=time;}
			if(time < smallest){smallest=time;}
			}	
		}
		System.out.println((int)Math.ceil(smallest));
	}
	buffer.close();
	}
}
