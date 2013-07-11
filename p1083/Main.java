import java.io.*;
import java.util.*;
import java.math.*;

public class Main{
	static int mapping(int[] space,int from,int to,int time){
		for(int i=from;i<=to;i++){
			space[i]++;
			if(space[i]>time){
			time=space[i];
			}
		}
	return time;
	}
	public static void main(String[] args)throws Exception{
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	int testcase,room,room1,room2,min1,max1;
	String moving;
	int[] space = new int[401];
	testcase = Integer.parseInt(buffer.readLine());
	int time;
	StringTokenizer idata;
	while(testcase>0){
		time=0;
		Arrays.fill(space,0);
		room = Integer.parseInt(buffer.readLine());
		while(room>0){
			moving = buffer.readLine();
			idata = new StringTokenizer(moving);
			room1 = Integer.parseInt(idata.nextToken());
			room2 = Integer.parseInt(idata.nextToken());
			min1 = Math.min(room1,room2);
			max1 = Math.max(room1,room2);
			time = mapping(space,(min1+1)/2,(max1+1)/2,time);
			room--;
		}
	System.out.println(time*10);
	testcase--;
	}
	buffer.close();
}
}
