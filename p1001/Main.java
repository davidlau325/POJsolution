import java.math.*;
import java.io.*;
import java.util.*;
import java.lang.*;

public class Main{
	public static void main(String[] args)throws Exception{
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

	String read;
	StringTokenizer idata;
	int n;
	BigDecimal bdA;
	BigDecimal bdN;
	int precision;
	String out;
	while((read=buffer.readLine())!=null){
		idata = new StringTokenizer(read);
		bdA = new BigDecimal(idata.nextToken());
		n = Integer.parseInt(idata.nextToken());
		bdN = bdA.pow(n);
		bdN = bdN.stripTrailingZeros();
		out = bdN.toPlainString();
		System.out.println(out);
	}
	buffer.close();
	}
}
