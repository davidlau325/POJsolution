import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[])throws Exception{
		BufferedReader buffer = new BufferedReader(new
InputStreamReader(System.in));

	String read;
	Double totalBalance=0.0;

	for(int i=0;i<12;i++){
		read = buffer.readLine();
		totalBalance+=Double.parseDouble(read);
	}
	System.out.printf("$%.2f",(totalBalance/12));

	}
}
