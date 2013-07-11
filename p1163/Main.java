import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws Exception{
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	
	int line = Integer.parseInt(buffer.readLine());
	int[] store = new int[6000];
	Arrays.fill(store,0);
	String read;
	StringTokenizer idata;
	int j,temp,left,right;
	int count=1;
	int max=0;
	for(int i=1;i<=line;i++){
		read = buffer.readLine();
		idata = new StringTokenizer(read);
		
		for(j=0;j<i;j++){
			int cut = (i-1);
			temp=Integer.parseInt(idata.nextToken());
			if(j==0){
			store[count]=store[(count-cut)]+temp;
				if(store[count]>max){max=store[count];}
			}else if(j==(i-1)){
			store[count+j]=store[(count+j-cut-1)]+temp;
				if(store[count+j]>max){max=store[count+j];}
			}else{
			left = store[(count+j-cut-1)];
			right = store[(count+j-cut)];			
			if(left>right){
				store[count+j]=left+temp;
				if(store[count+j]>max){max=store[count+j];}
			}else{
				store[count+j]=right+temp;
				if(store[count+j]>max){max=store[count+j];}
			}
			}
		}	
		count+=i;
	}
	System.out.println(max);
	buffer.close();
}
}
