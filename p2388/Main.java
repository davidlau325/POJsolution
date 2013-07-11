import java.io.*;
import java.util.*;
import java.math.*;

public class Main{
	public static void main(String[] args)throws Exception{
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	int totalmilk = Integer.parseInt(buffer.readLine());
	int[] allmilk = new int[totalmilk];
	int median;
	for(int i=0;i<totalmilk;i++){
		allmilk[i]=Integer.parseInt(buffer.readLine());
	}
	Arrays.sort(allmilk);
	median = (totalmilk/2);
	System.out.println(allmilk[median]);
	buffer.close();
}
}
