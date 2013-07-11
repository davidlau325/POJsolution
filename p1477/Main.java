import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws Exception{
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	int block,i,temp;
	int set=1;
	int acc;
	int min;
	int[] store;
	StringTokenizer idata;
	while((block=Integer.parseInt(buffer.readLine()))!=0){
		idata = new StringTokenizer(buffer.readLine());
		store = new int[block];
		acc=0;
		min=0;
		for(i=0;i<block;i++){
			temp=Integer.parseInt(idata.nextToken());
			acc+=temp;
			store[i]=temp;
		}
		acc/=block;
		for(i=0;i<block;i++){
			if(store[i]>acc){
			min+=(store[i]-acc);
			}
		}
	System.out.println("Set #"+set);
	System.out.println("The minimum number of moves is "+min+".");
	System.out.println();
	set++;
	}
	buffer.close();
}
}
