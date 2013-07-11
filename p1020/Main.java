import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws Exception{
	BufferedReader buffer=new BufferedReader(new
InputStreamReader(System.in));

	String read;
	StringTokenizer idata;
	int cakeside,nump,sidep,tempp;
	int testcase=Integer.parseInt(buffer.readLine());
	while(testcase>0){
	sidep=0;
	read=buffer.readLine();
	idata=new StringTokenizer(read);
	cakeside=Integer.parseInt(idata.nextToken());
	cakeside=cakeside*cakeside;
	nump=Integer.parseInt(idata.nextToken());
	for(int i=0;i<nump;i++){
		tempp=Integer.parseInt(idata.nextToken());
		sidep+=(tempp*tempp);
	}
	if(sidep==cakeside){
	System.out.println("KHOOOOB!");
	}else{
	System.out.println("HUTUTU!");
	}

	testcase--;
	}
	buffer.close();
}
}
