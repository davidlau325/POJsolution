import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader buffer = new BufferedReader(new
InputStreamReader(System.in));

		int[] allPrime = new int[1000001];
		int max =1000000;
		Arrays.fill(allPrime,1);
		int i=2;
		int cross = 0;
		allPrime[0]=0;
		allPrime[1]=0;

		while(i*i <= max){
			if(allPrime[i]!=0){
				cross = i+i;
				while(cross<=max){
					allPrime[cross]=0;
					cross+=i;
				}
			}
			i++;
		}

		String read;
		int even,j;
		int b=0;
		
		while(!(read = buffer.readLine()).equals("0")){
			even = Integer.parseInt(read);
			for(j=3;j<(max+1);j++){
				if(allPrime[j]==1){
					b=even - j;
					if(allPrime[b]==1){
					break;
					}
				}
			}
			System.out.println(even + " = " + j+" + "+b);
		}
		
		
	}
}
