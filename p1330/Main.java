import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

	String read;
	int cases,i,testcases,parentInput,childInput;
	int[] parent;
	StringTokenizer idata;
	int a=0;
	int b=0;
	Vector<Integer> aParent;
	int findParent =0;
	testcases = Integer.parseInt(buffer.readLine());
	for(int k=0;k<testcases;k++){
		read = buffer.readLine();
		if(read!=null){
		cases = Integer.parseInt(read);
		parent = new int[cases];
		Arrays.fill(parent,0);
		for(i=0;i<cases;i++){
			read = buffer.readLine();
			if(read!=null){
			idata = new StringTokenizer(read);
			if(i==(cases-1)){
			a = Integer.parseInt(idata.nextToken());
			b = Integer.parseInt(idata.nextToken());
			aParent = new Vector<Integer>();
			aParent.add((Integer)a);
			findParent = a;
			int root=0;
			int found=0;
			while(parent[findParent]!=0){
				findParent = parent[findParent];
				if(findParent == b){
					System.out.println(findParent);
					found=1;
					break;
				}
				aParent.add(findParent);
			}
			if(found==0){
				findParent = b;
				while(parent[findParent]!=0){
				findParent = parent[findParent];
				if(aParent.contains((Integer)findParent)){
					System.out.println(findParent);
					break;
				}
				}
			}
	
			}else{
			parentInput = Integer.parseInt(idata.nextToken());
			childInput = Integer.parseInt(idata.nextToken());
			parent[childInput] = parentInput; 
			}
			}
		}
		}
	}
	buffer.close();
}
}
