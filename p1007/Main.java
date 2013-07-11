import java.io.*;
import java.util.*;

public class Main{

	static int computeIn(String input,int len){
		char[] charInput = input.toCharArray();
		int totalIn=0;
		for(int i=0;i<len;i++){
			for(int j=i;j<len;j++){
			if(charInput[i]>charInput[j]){
				totalIn++;
			}
			}
		}
	return totalIn;
	}
	public static void main(String[] args)throws Exception{
	
	BufferedReader buffer = new BufferedReader(new
InputStreamReader(System.in));

	StringTokenizer idata;
	String read;

	read = buffer.readLine();
	idata = new StringTokenizer(read);
	int stringLength = Integer.parseInt(idata.nextToken());
	int stringRow = Integer.parseInt(idata.nextToken());

	String[] storeString = new String[stringRow];
	int[] storeValue = new int[stringRow];

	for(int i=0;i<stringRow;i++){
		read = buffer.readLine();
		storeValue[i]=computeIn(read,stringLength);
		storeString[i]=read;
	}
	int min=0;
	int minArray=0;
	for(int i=0;i<stringRow;i++){
		min = storeValue[i];
		minArray= i;
		for(int j=0;j<stringRow;j++){
			if(min==-1){
				min=storeValue[j];
				minArray=j;
			}
			if(storeValue[j]<min && storeValue[j]>-1){
				min=storeValue[j];
				minArray=j;
			}
		}
		System.out.println(storeString[minArray]);
		storeValue[minArray]=-1;
		storeString[minArray]="";
	}
	System.exit(0);
	}
}
