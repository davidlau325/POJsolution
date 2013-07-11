import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws Exception{
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	
	int N;
	int total;
	int loop = Integer.parseInt(buffer.readLine());
	for(int i=0;i<loop;i++){
		N = Integer.parseInt(buffer.readLine());
		total=0;
			while(N>0){
				N=N/5;
				total+=N;
			}	
			System.out.println(total);
	}
	buffer.close();
	}
}
