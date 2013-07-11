import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws
Exception{
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

	String read;
	int currentCount=0;
	int totalSize =0;
	TreeMap<String,Integer> species = new TreeMap<String,Integer>();
	while((read = buffer.readLine())!=null){
		if(species.containsKey(read)){
			currentCount = species.get(read);
			species.put(read,(currentCount+1));
		}else{
			species.put(read,1);
		}
		totalSize++;
	}
	double population,count;
	for(Map.Entry entry:species.entrySet()){
		System.out.print(entry.getKey()+ " ");
		Object temp = entry.getValue();
		count = Double.parseDouble(temp.toString());
		population = (count/(double)totalSize)*100;
		System.out.printf("%.4f\n",population);
	}
}
}
