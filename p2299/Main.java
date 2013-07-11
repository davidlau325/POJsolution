import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws Exception{
	BufferedReader buffer = new BufferedReader(new
InputStreamReader(System.in));

	int read,i,input,total;
	int index=0;
	ArrayList<Integer> ori;
	ArrayList<Integer> sorted;
	while((read=Integer.parseInt(buffer.readLine()))!=0){
	ori = new ArrayList<Integer>();
	sorted = new ArrayList<Integer>();
	total=0;
	for(i=0;i<read;i++){
		input=Integer.parseInt(buffer.readLine());
		if(!ori.contains((Integer)input)){
		ori.add((Integer)input);
		sorted.add((Integer)input);
		Collections.sort(sorted);
		index=Collections.binarySearch(sorted,(Integer)input);
		total+=(sorted.size()-(index+1));
		}
	}
	System.out.println(total);
	}
	buffer.close();
}
}
