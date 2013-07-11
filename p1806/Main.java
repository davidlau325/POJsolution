import java.io.*;
import java.util.*;
import java.lang.*;

public class Main{

	static int computeD(int x1,int y1,int x2,int y2){
		return Math.abs(x1-x2)+Math.abs(y1-y2);
	}
	public static void main(String args[])throws Exception{
	BufferedReader buffer = new BufferedReader(new
InputStreamReader(System.in));

	String read;
	int scenario;

	read = buffer.readLine();
	scenario = Integer.parseInt(read);
	int ignore=0;
	int oil,gridsize;
	for(int i=1;i<=scenario;i++){
		read = buffer.readLine();
		oil = Integer.parseInt(read);
		if(oil>9){
		ignore++;
		}else if(oil==0){
		System.out.println("Scenario #"+(i-ignore)+":");
		System.out.println("slice #1:");
		System.out.println("0");
		System.out.println("");
		}else{
			gridsize = (oil*2)+1;
			System.out.println("Scenario #"+(i-ignore)+":");
			int center = oil;
			int centerX = (gridsize/2);
			int centerY = (gridsize/2);
			int printValue,checkRange;
			for(int j=1;j<=gridsize;j++){
				System.out.println("slice #"+j+":");
				for(int k=0;k<gridsize;k++){
					for(int m=0;m<gridsize;m++){
						checkRange=Math.abs(Math.abs(center)-oil);
						if(checkRange>=(printValue=computeD(k,m,centerX,centerY))){
						System.out.print(printValue+Math.abs(center));
						}else{
						System.out.print(".");
						}
					}
				System.out.println("");
				}
				center--;
			}
			System.out.println("");
		}
	}
	}
}
