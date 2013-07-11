import java.io.*;
import java.util.*;

public class Main{
	static int checksum(String input){
		char[] inputC = input.toCharArray();
		int output=0;
		for(int i=0;i<inputC.length;i++){
			if(inputC[i]!=' '){
			output+=((inputC[i]-'A'+1)*(i+1));
			}
		}
	return output;
	}
	public static void main(String[] args)throws Exception{
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

	String read;
	while(!(read=buffer.readLine()).equals("#")){
		System.out.println(checksum(read));
	}
	buffer.close();
}
}
