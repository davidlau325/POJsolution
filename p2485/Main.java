import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws Exception{
	BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
	String read;
	int test,N,cost,total;
	StringTokenizer idata;
	int[][] edge;
	int[] smallest;
	int[] visited;

	test=Integer.parseInt(buffer.readLine());
	for(int i=0;i<test;i++){
		read=buffer.readLine();
		N=Integer.parseInt(buffer.readLine());
		edge=new int[N][N];
		smallest=new int[N];
		int min=Integer.MAX_VALUE;
		int nextChecking=0;
		for(int j=0;j<N;j++){
			read=buffer.readLine();
			idata=new StringTokenizer(read);
			for(int k=0;k<N;k++){
			cost=Integer.parseInt(idata.nextToken());
			edge[j][k]=cost;
			if(j==0){
			smallest[k]=cost;
			if(cost<min && cost!=0){
			min=cost;
			nextChecking=k;
			}
			}		
			}
		}
	visited=new int[N];
	visited[0]=1;
	visited[nextChecking]=1;
	int tempChecking=nextChecking;
	for(int l=0;l<N;l++){
		min=Integer.MAX_VALUE;
		for(int p=0;p<N;p++){
			if(edge[nextChecking][p]<smallest[p] && visited[p]!=1){
			smallest[p]=edge[nextChecking][p];
			}
			if(smallest[p]<min && visited[p]!=1){
			tempChecking=p;
			min=smallest[p];
			}
		}
	nextChecking=tempChecking;
	visited[nextChecking]=1;
	}	
	total=Integer.MIN_VALUE;
	for(int m=0;m<N;m++){
	if(smallest[m]>total){
	total=smallest[m];
	}
	}	
	System.out.println(total);
	}
	buffer.close();
}
}
