import java.io.*;
import java.util.*;

public class Main{
	static int computeDist(String s1,String s2){
		int dist=0;
		for(int i=0;i<7;i++){
			if(s1.charAt(i)!=s2.charAt(i)){
			dist++;
			}
		}
	return dist;
	}	
	public static void main(String[] args)throws Exception{
	BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
	String[] vertex;
	String read;
	int[][] dist;
	int[] smallest;
	int[] visited;
	int truck,i,j,distance,quality,min,checking;
	while((truck=Integer.parseInt(buffer.readLine()))!=0){
		vertex=new String[truck];
		dist=new int[truck][truck];
		smallest=new int[truck];
		visited=new int[truck];
		for(i=0;i<truck;i++){
			vertex[i]=buffer.readLine();
		}
		quality=0;
		distance=0;
		checking=0;
		min=Integer.MAX_VALUE;
		for(i=0;i<truck;i++){
			dist[i][i]=0;
			for(j=(i+1);j<truck;j++){
			distance=computeDist(vertex[i],vertex[j]);
			dist[i][j]=distance;
			dist[j][i]=distance;
			if(i==0){
			smallest[j]=distance;
			if(distance!=0 && distance<min){
			min=distance;
			checking=j;
			}
			}	
			}
		}
		smallest[0]=0;
		visited[0]=1;
		visited[checking]=1;
		int tempchecking=0;
		for(i=2;i<truck;i++){
			min=Integer.MAX_VALUE;
			for(j=0;j<truck;j++){
			if((dist[checking][j]<smallest[j])&&visited[j]!=1){
				smallest[j]=dist[checking][j];
			}
			if(smallest[j]<min && visited[j]!=1){
			min=smallest[j];
			tempchecking=j;
			}
			}
		checking=tempchecking;
		visited[checking]=1;
		}
	for(i=0;i<truck;i++){
	quality+=smallest[i];
	}
		
	System.out.println("The highest possible quality is 1/"+quality+".");
	}
	buffer.close();
}
}
