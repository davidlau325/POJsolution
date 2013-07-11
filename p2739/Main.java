import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws Exception{
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

	int[] allPrime = new int[10001];
	int[] addPrime = new int[10001];
	Arrays.fill(allPrime,1);
	Arrays.fill(addPrime,0);
	allPrime[0]=allPrime[1]=0;
	int i=2;
	int j,k;
	int[] primeList = new int[1229];
	while(i*i<10001){
		j=i;
		k=2;
		if(allPrime[j]==1){
		while(j*k<10001){
			allPrime[(j*k)]=0;
			k++;		
		}
		}
	i++;
	}
	int count=0;
	int acc=0;
	for(int l=0;l<10001;l++){
		if(allPrime[l]==1){
			acc+=l;
			primeList[count]=l;
			if(acc<=10000){
			addPrime[acc]++;}
			count++;	
		}
	}
	int check=1;
	int loop=0;
	while(check<1229){
		acc=0;
		loop=check;
		while(loop<1229){
		acc+=primeList[loop];
		if(acc<=10000){addPrime[acc]++;}else{break;}
		loop++;
		}
	check++;	
	}

	int input;
	while((input=Integer.parseInt(buffer.readLine()))!=0){
		System.out.println(addPrime[input]);
	}
	buffer.close();
}
}
