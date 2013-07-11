import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws Exception{
	BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
	int test,plate,last;
	String read;
	int[] front=new int[26];
	int[] end=new int[26];
	int frontC,endC,noEnd,noFront,fail,haveEqual,countE,countOne;

	test=Integer.parseInt(buffer.readLine());
	for(int i=0;i<test;i++){
		plate=Integer.parseInt(buffer.readLine());
		Arrays.fill(front,0);
		Arrays.fill(end,0);
		haveEqual=0;
		for(int j=0;j<plate;j++){
		read=buffer.readLine();
		frontC=read.charAt(0)-'a';
		last=read.length();
		endC=read.charAt((last-1))-'a';
		front[frontC]++;
		end[endC]++;
		if(frontC==endC){
		haveEqual=1;
		}	
		}
		noEnd=0;
		noFront=0;
		fail=0;
		countE=0;
		countOne=0;
		if(plate!=1){
		for(int k=0;k<26;k++){
		if((front[k]-end[k])==1){
		noEnd++;
		}else if((front[k]-end[k])>1){
		fail=1;
		}
		if((end[k]-front[k])==1){
		noFront++;
		}else if((front[k]-end[k])>1){
		fail=1;
		}
		if(end[k]==front[k] && end[k]!=0){
		countE++;
		if(end[k]==1){
		countOne++;
		}
		}
		if(fail==1){
		break;
		}
		if(noFront>1 || noEnd>1){
		fail=1;
		break;
		}
		}
		}
	if(plate==1){
	System.out.println("Ordering is possible.");
	}else if(fail==1){
	System.out.println("The door cannot be opened.");
	}else if(haveEqual==1 && (countE==plate)){
	System.out.println("The door cannot be opened.");
	}else if(countOne==countE && countE==plate && countOne>2){
	System.out.println("The door cannot be opened.");
	}else{
	System.out.println("Ordering is possible.");
	}
	}
	buffer.close();
}
}
