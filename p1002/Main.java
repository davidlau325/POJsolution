import java.io.*;
import java.util.*;

public class Main{
	static String convert(String inputA){
		char[] input = inputA.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<input.length;i++){
			if(Character.isDigit(input[i])){
				sb.append(input[i]);
			}else if(input[i]=='A' || input[i]=='B' || input[i]=='C'){
				sb.append('2');
			}else if(input[i]=='D' || input[i]=='E' || input[i]=='F'){
				sb.append('3');
			}else if(input[i]=='G' || input[i]=='H' || input[i]=='I'){
				sb.append('4');
			}else if(input[i]=='J' || input[i]=='K' || input[i]=='L'){
				sb.append('5');
			}else if(input[i]=='M' || input[i]=='N' || input[i]=='O'){
				sb.append('6');
			}else if(input[i]=='P' || input[i]=='R' || input[i]=='S'){
				sb.append('7');
			}else if(input[i]=='T' || input[i]=='U' || input[i]=='V'){
				sb.append('8');
			}else if(input[i]=='W' || input[i]=='X' || input[i]=='Y'){
				sb.append('9');
			}
		}
	String output = sb.toString();
	String output2 = output.substring(0,3)+"-"+output.substring(3);
	return output2;
	}
	public static void main(String[] args)throws Exception{
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

	int number = Integer.parseInt(buffer.readLine());
	String read,output;
	String temp;
	int acc,tempINT;
	Object tempValue;
	int flag=0;
	TreeMap<String,Integer> store = new TreeMap<String,Integer>();
	for(int i=0;i<number;i++){
		read = buffer.readLine().replace("-","");;
		temp = convert(read);
		if(store.containsKey(temp)){
			acc=(int)store.get(temp);
			acc++;
			store.put(temp,new Integer(acc));
		}else{
		store.put(temp,1);
		}
	}
	for(Map.Entry entry:store.entrySet()){
		tempValue = entry.getValue();
		tempINT = Integer.parseInt(tempValue.toString());
		if(tempINT>1){
		flag=1;
		System.out.print(entry.getKey()+" ");
		System.out.println(tempINT);
		}
	}
	if(flag==0){
		System.out.println("No duplicates.");
	}
	buffer.close();
}
}
