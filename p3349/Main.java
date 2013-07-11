import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws Exception{
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer idata,sameHash;
	String read;
	int n,a1,a2,a3,a4,a5,a6,j,k;
	int found=0;
	int hashValue=0;
	String[] angle;
	n = Integer.parseInt(buffer.readLine());
	angle = new String[n];
	TreeMap<Integer,String> storeHash = new TreeMap<Integer,String>();
	String sameHashArray;
	int checkingKey=0;
	int allFound;

	for(int i=0;i<n;i++){
		read = buffer.readLine();
		idata = new StringTokenizer(read);
		allFound=0;
		if(found==0){
		a1=Integer.parseInt(idata.nextToken());
		a2=Integer.parseInt(idata.nextToken());
		a3=Integer.parseInt(idata.nextToken());
		a4=Integer.parseInt(idata.nextToken());
		a5=Integer.parseInt(idata.nextToken());
		a6=Integer.parseInt(idata.nextToken());
		hashValue=a1+a2+a3+a4+a5+a6;
			if(i>0){
				if(storeHash.containsKey((Integer)hashValue)){
				sameHashArray=storeHash.get((Integer)hashValue);
				sameHash = new StringTokenizer(sameHashArray);
				while(sameHash.hasMoreTokens()){
					checkingKey=Integer.parseInt(sameHash.nextToken());
					StringBuffer sb = new StringBuffer();
					sb.append(a1);sb.append(a2);sb.append(a3);sb.append(a4);sb.append(a5);sb.append(a6);
					if(angle[checkingKey].equals(sb.toString())){allFound=1;}else{
					sb = new StringBuffer();
					sb.append(a2);sb.append(a3);sb.append(a4);sb.append(a5);sb.append(a6);sb.append(a1);
					if(angle[checkingKey].equals(sb.toString())){allFound=1;}else{
					sb = new StringBuffer();
					sb.append(a3);sb.append(a4);sb.append(a5);sb.append(a6);sb.append(a1);sb.append(a2);
					if(angle[checkingKey].equals(sb.toString())){allFound=1;}else{
					sb = new StringBuffer();
					sb.append(a4);sb.append(a5);sb.append(a6);sb.append(a1);sb.append(a2);sb.append(a3);
					if(angle[checkingKey].equals(sb.toString())){allFound=1;}else{
					sb = new StringBuffer();
					sb.append(a5);sb.append(a6);sb.append(a1);sb.append(a2);sb.append(a3);sb.append(a4);
					if(angle[checkingKey].equals(sb.toString())){allFound=1;}else{
					sb = new StringBuffer();
					sb.append(a6);sb.append(a1);sb.append(a2);sb.append(a3);sb.append(a4);sb.append(a5);
					if(angle[checkingKey].equals(sb.toString())){allFound=1;}else{
					sb = new StringBuffer();
					
					sb.append(a6);sb.append(a5);sb.append(a4);sb.append(a3);sb.append(a2);sb.append(a1);
					if(angle[checkingKey].equals(sb.toString())){allFound=1;}else{
					sb = new StringBuffer();
					sb.append(a1);sb.append(a6);sb.append(a5);sb.append(a4);sb.append(a3);sb.append(a2);
					if(angle[checkingKey].equals(sb.toString())){allFound=1;}else{
					sb = new StringBuffer();
					sb.append(a2);sb.append(a1);sb.append(a6);sb.append(a5);sb.append(a4);sb.append(a3);
					if(angle[checkingKey].equals(sb.toString())){allFound=1;}else{
					sb = new StringBuffer();
					sb.append(a3);sb.append(a2);sb.append(a1);sb.append(a6);sb.append(a5);sb.append(a4);
					if(angle[checkingKey].equals(sb.toString())){allFound=1;}else{
					sb = new StringBuffer();
					sb.append(a4);sb.append(a3);sb.append(a2);sb.append(a1);sb.append(a6);sb.append(a6);
					if(angle[checkingKey].equals(sb.toString())){allFound=1;}else{
					sb = new StringBuffer();
					sb.append(a5);sb.append(a4);sb.append(a3);sb.append(a2);sb.append(a1);sb.append(a6);
					if(angle[checkingKey].equals(sb.toString())){allFound=1;}
					}}}}}}}}}}}	
				if(allFound==1){
				System.out.println("Twin snowflakes found.");
				found=1;
				break;
				}
				}
				}								
			}
		if(storeHash.containsKey((Integer)hashValue)){
			StringBuffer sb = new StringBuffer();
			sb.append(storeHash.get((Integer)hashValue));
			sb.append(" ");
			sb.append(i);
			storeHash.put((Integer)hashValue,sb.toString());
		}else{
			storeHash.put((Integer)hashValue,i+"");
		}
		StringBuffer sb = new StringBuffer();
		sb.append(a1);
		sb.append(a2);
		sb.append(a3);
		sb.append(a4);
		sb.append(a5);
		sb.append(a6);
		angle[i]=sb.toString();
		}
	if(i==(n-1)&&found==0){
		System.out.println("No two snowflakes are alike.");
	}
	}
	buffer.close();
}
}
