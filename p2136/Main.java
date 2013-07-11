import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws Exception{
	
	BufferedReader buffer = new BufferedReader(new
InputStreamReader(System.in));
	
	int[] storeABC = new int[26];
	String read;
	
	for(int i=0;i<4;i++){
		read = buffer.readLine();
		char[] readChar = read.toCharArray();
		for(int j=0;j<readChar.length;j++){
			if((readChar[j]>='A')&&(readChar[j]<='Z')){
				storeABC[(readChar[j]-'A')]++;
			}	
		}
	}
	int largest=0;
	for(int k=0;k<26;k++){
		if(storeABC[k]>largest){
		largest=storeABC[k];
		}
	}
	
	for(int m=largest;m>0;m--){
		for(int j=0;j<26;j++){
		if(j!=0){
		System.out.print(" ");
		}	
			if(storeABC[j]>=m){
			System.out.print("*");
			}else{
			System.out.print(" ");
			}
		}
		System.out.print("\n");
	}
	for(int i=0;i<26;i++){
		int alpha = 'A'+i;
		if(i!=0){System.out.print(" ");}
		System.out.printf("%c",alpha);
	}

	}
}
