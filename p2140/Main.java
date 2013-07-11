import java.io.*;
import java.util.*;
import java.lang.*;

public class Main{
	public static void main(String args[])throws Exception{
	
	BufferedReader buffer = new BufferedReader(new
InputStreamReader(System.in));

	String read = buffer.readLine();
	int cow = Integer.parseInt(read);
	buffer.close();

	int count=0;
	double temp = Math.sqrt(2*cow);
	int cow1 = (int)temp+1;
	
	for(int i=2;i<cow1;i++){
		if(((cow-(i*(i-1)/2)) % i)==0){
		count++;
		}
	}
	count++;
	System.out.println(count);
	}
}
