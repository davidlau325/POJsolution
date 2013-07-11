import java.io.*;
import java.util.*;

public class Main{
	static class trie{
		private int last;
		private trie[] next;
	
		public trie(){
			next=new trie[10];
			for(int i=0;i<10;i++){
			next[i]=null;
			}
			last=0;
		}
		public boolean find(int k){
			if(next[k]==null){
			return false;
			}else{
			return true;
			}
		}
		public void addNew(int k){
			next[k]=new trie();
		}
		public boolean isLast(int k){
			if(this.last==1){
			return true;
			}else{
			return false;
			}
		}
		public void makeLast(int k){
			this.last=1;
		}
	}
	public static void main(String [] args)throws Exception{
	BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
	int test,phone,check,cont,found;
	trie root;
	String read;
	test=Integer.parseInt(buffer.readLine());
	for(int i=0;i<test;i++){
		root=new trie();
		found=0;
		phone=Integer.parseInt(buffer.readLine());
		for(int j=0;j<phone;j++){
		trie tmpRoot=root;
		read=buffer.readLine();
			if(found==0){	
			cont=1;
			for(int k=0;k<read.length();k++){
				check=read.charAt(k)-'0';
				if(k==0){
				if(tmpRoot.find(check)){
				cont=1;
				if(tmpRoot.isLast(check)){
				found=1;
				}
				tmpRoot=tmpRoot.next[check];
				}else{
				cont=0;
				tmpRoot.addNew(check);
				if(read.length()==1){
				tmpRoot.makeLast(check);
				}else{
				tmpRoot=tmpRoot.next[check];
				}
				}

				}else{
				if(cont==1){
				if(tmpRoot.find(check)){
				cont=1;
					if(k==(read.length()-1)){
					found=1;
					}else{
					if(tmpRoot.isLast(check)){
					found=1;
					}
					tmpRoot=tmpRoot.next[check];
					}	
				}else{
				cont=0;
				tmpRoot.addNew(check);
				if(k==(read.length()-1)){
				tmpRoot.makeLast(check);
				}else{
				tmpRoot=tmpRoot.next[check];
				}
				}
				}else{
				tmpRoot.addNew(check);
				if(k==(read.length()-1)){
				tmpRoot.makeLast(check);
				}else{
				tmpRoot=tmpRoot.next[check];
				}
				}
				}
			}
			}
		}
	if(found==1){
	System.out.println("NO");
	}else{
	System.out.println("YES");
	}
	}
	buffer.close();

}
}
