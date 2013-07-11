import java.io.*;
import java.util.*;

public class Main{
	static boolean checkCycle(int[] ParentChild,Object checkKids){
		int findParent = Integer.parseInt(checkKids.toString());
		int original=findParent;
		while(ParentChild[findParent]!=0){
			findParent = ParentChild[findParent];
			if(findParent==original){
			return true;		
			}
		}
	return false;
	}
	public static void main(String[] args)throws Exception{
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	String read;
	StringTokenizer idata;
	int parent,child,stop,countroot;
	int isTree=1;
	int testcase = 1;
	int end=0;
	int[] ParentChild = new int[10000];
	Arrays.fill(ParentChild,0);
	HashMap<Integer,Integer> ChildParent = new HashMap<Integer,Integer>();
	while((read=buffer.readLine())!=null){
		idata = new StringTokenizer(read);
		if(end==1){end=0;}
		stop=0;
		while(stop==0){
		try{
		parent = Integer.parseInt(idata.nextToken());
		child = Integer.parseInt(idata.nextToken());
		if(parent == 0 && child == 0){
			end=1;
			read=buffer.readLine();
			break;
		}else if(parent==child){
			isTree=0;
		}else if(ParentChild[parent]==child){
			isTree=0;
		}else if(ChildParent.containsKey((Integer)child)){
			isTree=0;
		}else{
		ChildParent.put((Integer)child,(Integer)parent);
		ParentChild[parent]=child;
		}
		}catch(NoSuchElementException e){
		stop=1;
		}
		}

		if(end==1){
			if(isTree==0){
			System.out.println("Case "+testcase+" is not a tree.");
			isTree=1;
			}else{
			countroot=0;
			Collection c = ChildParent.values();
			Iterator itr = c.iterator();
			while(itr.hasNext()){
			 	Object next=itr.next();
				if(!ChildParent.containsKey((Integer)next)){
					int checkNext=Integer.parseInt(next.toString());
					if(countroot==0){countroot=checkNext;}
					else if(countroot!=checkNext){
					isTree=0;
					break;
					}
				}	
			}
				if(isTree==0){
			System.out.println("Case "+testcase+" is not a tree.");
			isTree=1;
				}else{
			Set st=ChildParent.keySet();
			itr = st.iterator();
			while(itr.hasNext()){
				if(checkCycle(ParentChild,(Integer)itr.next())){
				isTree=0;
				break;
				}
			}
			if(isTree==0){
			System.out.println("Case "+testcase+" is not a tree.");isTree=1;
			}else{System.out.println("Case "+testcase+" is a tree.");}
			}
			}
		testcase++;
		Arrays.fill(ParentChild,0);
		ChildParent.clear();
		}	
	}
	buffer.close();
}
}
