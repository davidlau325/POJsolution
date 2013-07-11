import java.io.*;
import java.util.*;

public class Main{
	static class path{
	private int a;
	private int b;
	private int cost;
	public path(int a,int b,int cost){
	this.a=a;
	this.b=b;
	this.cost=cost;
	}
	public int getA(){
	return this.a;
	}
	public int getB(){
	return this.b;
	}
	public int getCost(){
	return this.cost;
	}
	}
	public static void main(String[] args)throws Exception{
	BufferedReader buffer = new BufferedReader(new
InputStreamReader(System.in));
	String read;
	StringTokenizer idata;
	int farm = Integer.parseInt(buffer.readLine());
	int vertex,pathN,hole;
	int a,b,cost;
	path[] edge;
	int[] dist;
	int max=Integer.MAX_VALUE;
	while(farm>0){
		read=buffer.readLine();
		idata = new StringTokenizer(read);
		vertex=Integer.parseInt(idata.nextToken());
		pathN=Integer.parseInt(idata.nextToken());
		hole=Integer.parseInt(idata.nextToken());
		edge=new path[((pathN*2)+hole+vertex)];
		dist=new int[(vertex+1)];
	int i;
	int add=1;
	for(i=0;i<vertex;i++){
	edge[i]=new path(0,add,0);
	add++;
	}
	for(;i<((pathN*2)+vertex);i++){
	read=buffer.readLine();
	idata=new StringTokenizer(read);
	a=Integer.parseInt(idata.nextToken());
	b=Integer.parseInt(idata.nextToken());
	cost=Integer.parseInt(idata.nextToken());
	edge[i++]=new path(a,b,cost);
	edge[i]=new path(b,a,cost);
	}
	for(;i<((pathN*2)+hole+vertex);i++){
	read=buffer.readLine();
	idata=new StringTokenizer(read);
	a=Integer.parseInt(idata.nextToken());
	b=Integer.parseInt(idata.nextToken());
	cost=Integer.parseInt(idata.nextToken());
	cost=cost*-1;
	edge[i]=new path(a,b,cost);
	}
	Arrays.fill(dist,max);
	dist[0]=0;
	int checkCycle=0;
	for(int k=0;k<vertex;k++){
	for(int j=0;j<((pathN*2)+hole+vertex);j++){
		a=edge[j].getA();
		b=edge[j].getB();
		cost=edge[j].getCost();
		if(dist[a]!=max){
		if(cost+dist[a]<dist[b]){
		dist[b]=dist[a]+cost;
		}
		}
	}
	}
	for(int j=0;j<((pathN*2)+hole+vertex);j++){
		a=edge[j].getA();
		b=edge[j].getB();
		cost=edge[j].getCost();
		if(dist[a]!=max){
		if(dist[b]>dist[a]+cost){
		checkCycle=1;
		break;
		}
		}
	}
	if(checkCycle==1){
	System.out.println("YES");
	}else{
	System.out.println("NO");
	}
	
	farm--;
	}
	buffer.close();
}
}
