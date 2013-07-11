import java.io.*;
import java.util.*;
import java.math.*;

public class Main{
	static long computeD(long x1,long y1,long x2,long y2){
		long first = x2-x1;
		long second = y2-y1;
		return (first*first)+(second*second);
	}

	public static void main(String[] args)throws Exception{
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

	String read;
	long[] storeX = new long[210];
	long[] storeY = new long[210];
	StringTokenizer idata;
	long tempX,tempY;
	int output=0;
	int count=0;
	while((read=buffer.readLine())!=null){
		idata = new StringTokenizer(read);
		tempX = (long)Double.parseDouble(idata.nextToken());
		tempY = (long)Double.parseDouble(idata.nextToken());
		storeX[count]=tempX;
		storeY[count]=tempY;
		count++;
	}
	int j;
	int tmpoutput;
	long checkX,checkY;
	for(int i=0;i<count;i++){
		tmpoutput=0;
		checkX=storeX[i];
		checkY=storeY[i];
		for(j=0;j<count;j++){
			if(j!=i){
			if((computeD(checkX,checkY,storeX[j],storeY[j]))<=25){
				tmpoutput++;	
			}
			}
		}
	if(tmpoutput>output){output=tmpoutput;}
	}
	System.out.println(output);
	buffer.close();
}
}
