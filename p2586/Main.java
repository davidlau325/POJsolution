import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws Exception{
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

	String read;
	StringTokenizer idata;
	int plus,deficit;
	int output,temp;
	while((read=buffer.readLine())!=null){
		idata = new StringTokenizer(read);
		plus = Integer.parseInt(idata.nextToken());
		deficit = Integer.parseInt(idata.nextToken());
	output = Integer.MIN_VALUE;
	if(((plus*4)-deficit)<0){
		temp=(plus*10)-(deficit*2);
		if(temp>output){output=temp;}
	}
	if(((plus*3)-(deficit*2))<0){
		temp=(plus*8)-(deficit*4);
		if(temp>output){output=temp;}
	}
	if(((plus*2)-(deficit*3))<0){
		temp=(plus*6)-(deficit*6);
		if(temp>output){output=temp;}
	}
	if((plus-(deficit*4))<0){
		temp=(plus*3)-(deficit*9);
		if(temp>output){output=temp;}
	}
	if((deficit*5*-1)<0){
		temp=(-1*deficit*12);
		if(temp>output){output=temp;}
	}
	if(output<0){
		System.out.println("Deficit");
	}else{
		System.out.println(output);
	}
	}
	buffer.close();
}
}
