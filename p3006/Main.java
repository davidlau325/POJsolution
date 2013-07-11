import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws Exception{
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	int[] primeA = new int[1000001];
	Arrays.fill(primeA,1);
	primeA[0]=primeA[1]=0;
	int i=2;
	int j,count;
	while((i*i)<1000001){
		j=i;
		count=2;
		if(primeA[j]==1){
		while((j*count)<1000001){
			primeA[(j*count)]=0;
		count++;
		}
		}
	i++;
	}
	
	String read;
	int a,d,n,countPrime,result;
	StringTokenizer idata;
	while((read=buffer.readLine())!=null){
		idata = new StringTokenizer(read);
		a = Integer.parseInt(idata.nextToken());
		d = Integer.parseInt(idata.nextToken());
		n = Integer.parseInt(idata.nextToken());

		if(a==0 && d==0 && n==0){System.exit(0);}
		result=0;
		countPrime=0;
		while(countPrime<n){
			if(primeA[a]==1){
				countPrime++;
			}
			if(countPrime==n){
			result=a;
			break;
			}
		a+=d;
		}
		System.out.println(result);		
	}		
	buffer.close();
}
}
