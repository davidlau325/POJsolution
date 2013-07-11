import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws Exception{
	
	BufferedReader buffer = new BufferedReader(new
InputStreamReader(System.in));
	String read;
	double cardLength;
	while((read = buffer.readLine())!=null){
		cardLength = Double.parseDouble(read);
		if(cardLength==0.00){System.exit(0);}
		double mid=2;
		double total=0;
		int countTotal=0;
		while(total<cardLength){
			total+=(1/mid);
			mid++;
			countTotal++;
		}
		
		System.out.println(countTotal+" card(s)");
	}
	}
}
