import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws Exception{
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	HashMap<String,Integer> hm = new HashMap<String,Integer>();
	TreeMap<Integer,String> tm;
	String read;
	String check="";
	int count=0;
	char abit;
	Integer temp;
	while(!(read=buffer.readLine()).equals("#")){
		hm.put(read,count);
	count++;
	}

	while(!(read=buffer.readLine()).equals("#")){
		if(hm.containsKey(read)){
			System.out.println(read+" is correct");
		}else{
		tm = new TreeMap<Integer,String>();
		for(int i=0;i<read.length();i++){
			check=read.substring(0,i)+read.substring((i+1),read.length());
			if(hm.containsKey(check)){
			tm.put(hm.get(check),check);
			}
			abit='a';
			for(int j=0;j<26;j++){
			check=read.substring(0,i)+abit+read.substring((i+1),read.length());
			if(hm.containsKey(check)){
			tm.put(hm.get(check),check);
			}
			abit++;
			}
			abit='a';
			for(int j=0;j<26;j++){
			check=read.substring(0,i)+abit+read.substring(i,read.length());
			if(hm.containsKey(check)){
			tm.put(hm.get(check),check);
			}
			abit++;
			}
		}
		abit='a';
		for(int i=0;i<26;i++){
		check=read+abit;
		if(hm.containsKey(check)){
		tm.put(hm.get(check),check);
		}
		abit++;
		}

		System.out.print(read+": ");
		for(Map.Entry entry:tm.entrySet()){
			System.out.print(entry.getValue()+" ");
		}
		System.out.println();
		}
	}
	buffer.close();
}
}
