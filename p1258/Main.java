import java.io.*;
import java.util.*;

public class Main{
	static class UnionFind{
	private int[] array;

	public UnionFind(int num){
		array=new int[num];	
		Arrays.fill(array,-1);
	}

	public void union(int a,int b){
		int root_a=find(a);
		int root_b=find(b);

		if(root_a==root_b)return;
		if(array[root_b]<array[root_a]){
		array[root_b]+=array[root_a];
		array[root_a]=root_b;
		}else{
		array[root_a]+=array[root_b];
		array[root_b]=root_a;
		}
	}

	public int find(int x){
		if(array[x]<0){return x;}
		else{
		array[x]=find(array[x]);
		return array[x];
		}
	}
	}
	static class Edge implements Comparable<Edge>{
	int a,b,cost;
	public Edge(int a,int b,int cost){
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
	@Override
	public int compareTo(Edge edge){
		return ((Integer)cost).compareTo((Integer)edge.cost);
	}
	@Override
	public String toString(){
		return ""+a+"-"+b+":"+cost+"";
	}
	}
	public static void main(String[] args)throws Exception{
	BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
	String read;
	int N;
	Edge[] edge;
	StringTokenizer idata;
	while((read=buffer.readLine())!=null){
	N=Integer.parseInt(read);
	int count,temp;
	edge=new Edge[(N*N)];
	int totalEdge=0;
	UnionFind uf = new UnionFind(N);
	for(int i=0;i<N;i++){
		count=0;
		while(count<=N){
		read=buffer.readLine();
		idata=new StringTokenizer(read);
		while(idata.hasMoreTokens()){
		temp=Integer.parseInt(idata.nextToken());
		edge[totalEdge]=new Edge(i,count,temp);
		count++;
		totalEdge++;
		}
		if(count==N){break;}
		}
	}
	Arrays.sort(edge);
	int fiberCount=0;
	int fiber=0;
	int A,B;
	int preRoot;
	int done=1;
	for(int i=0;i<(N*N);i++){
		preRoot=uf.find(0);
		for(int j=1;j<N;j++){
			if(uf.find(j)!=preRoot && preRoot!=-1){done=0;break;}
		}
		if(done==1){break;}else{
		if(edge[i].getCost()!=0){
		A=edge[i].getA();
		B=edge[i].getB();
		if(uf.find(A)!=uf.find(B)){
		fiber+=edge[i].getCost();
		uf.union(edge[i].getA(),edge[i].getB());
		fiberCount++;
		}
		}
		}
	}
	System.out.println(fiber);
	}
	buffer.close();
}
}
