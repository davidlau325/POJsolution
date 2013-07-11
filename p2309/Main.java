import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws Exception{
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	
	int test = Integer.parseInt(buffer.readLine());
	int root,acc,check;
	for(int i=0;i<test;i++){
		acc=1;
		check=2;
		root = Integer.parseInt(buffer.readLine());
		while(root%check==0){
			acc+=check;
			check*=2;
		}
		acc-=(check/2);
		System.out.println((root-acc)+" "+(root+acc));
	}
	buffer.close();
	}
}

