import java.io.*;
import java.util.*;
import java.math.*;

public class Main{
	static long checkX(char number,long x){
		long nextX=0;
		if(number == '8' || number == '2'){
			nextX = x;
		}else if(number == '4' || number == '7' || number == '1'){
			nextX = x-1;
		}else if(number == '6' || number == '9' || number == '3'){
			nextX = x+1;
		}else if(number == '5'){
			nextX = 0;
		}
	return nextX;
	}
	static long checkY(char number,long y){
		long nextY=0;
		if(number == '8' || number == '7' || number == '9'){
			nextY = y+1;
		}else if(number == '2' || number == '1' || number == '3'){
			nextY = y-1;
		}else if(number == '6' || number == '4'){
			nextY = y;
		}else if(number == '5'){
			nextY = 0;
		}
	return nextY;
	}

	public static void main(String[] args)throws Exception{
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	
	int read;
	int testcase = Integer.parseInt(buffer.readLine());
	int j;
	long areaSize;
	long xi,yi,xii,yii;
	for(int i=0;i<testcase;i++){
		xi=0;
		yi=0;
		xii=0;
		yii=0;
		areaSize=0;
		while((char)(read=buffer.read())!='5'){
			xii=checkX((char)read,xii);
			yii=checkY((char)read,yii);
			areaSize+=((xi*yii)-(xii*yi));
			xi=xii;
			yi=yii;
		}
	areaSize = Math.abs(areaSize);
	if((areaSize%2)==0){
	System.out.printf("%d\n",areaSize/2);
	}else{
	System.out.printf("%d.5\n",areaSize/2);
	}
	}
	buffer.close();
}
}
