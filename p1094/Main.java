import java.io.*;
import java.util.*;

public class Main{
	static void noincome(ArrayList<Integer> S,int[][] relation,int n){
		int income=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(relation[i][j]==1){
				income=1;
				break;	
				}
			}
		if(income==0){
		S.add((Integer)i);
		}else{
		income=0;
		}
		}
	}
	static boolean singleNoIncome(int[][] relation,int n,int check){
		for(int i=0;i<n;i++){
			if(relation[check][i]==1){
			return false;
			}
		}
	return true;
	}
	public static void main(String[] args)throws Exception{
	BufferedReader buffer = new BufferedReader(new
InputStreamReader(System.in));

	String read;
	char a,b;
	int n,r,j,check,o,p,inconsist,sorted,countAdd,countTmp;
	int[][] relation;
	ArrayList<Integer> S = new ArrayList<Integer>();
	ArrayList<Integer> L = new ArrayList<Integer>();
	StringTokenizer idata;
	while(!(read=buffer.readLine()).equals("0 0")){
		idata = new StringTokenizer(read);
		n=Integer.parseInt(idata.nextToken());
		r=Integer.parseInt(idata.nextToken());
		relation = new int[n][n];
		inconsist=0;
		sorted=0;
		
		for(int i=0;i<r;i++){
		countAdd=0;
		read=buffer.readLine();
		a=read.charAt(0);
		b=read.charAt(2);
		relation[(int)(b-'A')][(int)(a-'A')]=1;
		if(inconsist==0 && sorted==0){
		int[][] tempRelation = new int[relation.length][];
		for(int k=0;k<relation.length;k++){
			tempRelation[k]=relation[k].clone();
		}
		noincome(S,tempRelation,n);
		while(S.size()>0){
			check=(int)S.get(0);
			L.add((Integer)check);
			S.remove(0);
			countTmp=0;
			for(j=0;j<n;j++){
				if(tempRelation[j][check]==1){
					tempRelation[j][check]=0;
					if(singleNoIncome(tempRelation,n,j)==true){
						S.add((Integer)j);
						if(countTmp==0){
						countAdd++;
						countTmp=1;
						}
					}
				}
			}	
		}
		for(o=0;o<n;o++){
			for(p=0;p<n;p++){
				if(tempRelation[o][p]==1){
				inconsist=1;
				break;
				}
			}
		}
		if(countAdd==(n-1)){sorted=1;}	
		}
		if(inconsist==1){
		System.out.println("Inconsistency found after "+(i+1)+" relations.");
		inconsist=2;
		}
		if(sorted==1){
		StringBuffer sb = new StringBuffer();
		while(L.size()>0){
		sb.append((char)(L.get(0)+'A'));
		L.remove(0);
		}
		System.out.println("Sorted sequence determined after "+(i+1)+" relations: "+sb.toString()+".");
		sorted=2;
		}
		if(sorted==0 && inconsist==0 && i==(r-1)){
		System.out.println("Sorted sequence cannot be determined.");
		}
		S.clear();
		L.clear();
		}
	}
	buffer.close();
}
}
