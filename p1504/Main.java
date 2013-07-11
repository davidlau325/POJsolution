import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[])throws Exception{

	BufferedReader buffer = new BufferedReader(new
InputStreamReader(System.in));

	StringTokenizer idata;
	String read;
	read = buffer.readLine();
	int line = Integer.parseInt(read);
	int num1,num2,last1,last2,rev1,rev2,sum,revsum;
	for(int i=0;i<line;i++){
		read = buffer.readLine();
		idata = new StringTokenizer(read);
		num1 = Integer.parseInt(idata.nextToken());
		num2 = Integer.parseInt(idata.nextToken());

		rev1=0;
		rev2=0;
		while(num1!=0 || num2!=0){
			last1 = num1 % 10;
			last2 = num2 % 10;
			if(num1!=0){rev1=rev1*10 + last1;}
			if(num2!=0){rev2=rev2*10 + last2;}
			num1=num1/10;
			num2=num2/10;
		}
		sum = rev1+rev2;
		revsum=0;
		while(sum!=0){
			last1 = sum % 10;
			if(sum!=0){revsum=revsum*10 + last1;}
			sum=sum/10;
		}
		System.out.println(revsum);
	}


}
}
