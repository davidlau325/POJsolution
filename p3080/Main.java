import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws Exception{
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

	int testcase = Integer.parseInt(buffer.readLine());
	String read,key;
	int base,i,m,n,count;
	char[] compare1=new char[60];
	char[] compare2=new char[60];
	int length1=0;
	int length2=0;
	int[][] check;
	TreeMap<String,String> tm;
	String[][] checkS;
	StringBuffer sb;
	while(testcase>0){
		base = Integer.parseInt(buffer.readLine());
		tm = new TreeMap<String,String>();
		if(base==1){read=buffer.readLine();}else{
		check = new int[60][60];
		checkS = new String[60][60];
		for(i=0;i<base;i++){
		if(i==0){
		compare1=buffer.readLine().toCharArray();	
		length1=compare1.length;	
		}		
		if(i==1){
		compare2=buffer.readLine().toCharArray();
		length2=compare2.length;
			for(m=0;m<length1;m++){
				for(n=0;n<length2;n++){
					if(compare1[m]==compare2[n]){
					sb = new StringBuffer();
					sb.append(compare1[m]);
					if((m-1)<0 || (n-1)<0){
					check[m][n]=1;
					checkS[m][n]=sb.toString();
					}else{
					check[m][n]=check[m-1][n-1]+1;
					checkS[m][n]=checkS[m-1][n-1]+sb.toString();
					}
					}else{
					check[m][n]=0;
					checkS[m][n]="";
					}
				}	
			}	
	for(m=0;m<length1;m++){
		for(n=0;n<length2;n++){
		if(checkS[m][n].length()>2){
		tm.put(checkS[m][n],"0");
		}
		}
	}
	}
		if(i>1){
		read=buffer.readLine();
			Set st = tm.keySet();
			Iterator itr=st.iterator();
			while(itr.hasNext()){
				key = (String)itr.next();
				if(read.indexOf(key)==-1){
				tm.remove(key);
				st = tm.keySet();
				itr = st.iterator();
				}
			}
		}
	}
	}
	if(tm.size()==0){
		System.out.println("no significant commonalities");
	}else{
		int max=0;
		for(Map.Entry entry:tm.entrySet()){
			key = (String)entry.getKey();
			if(key.length()>max){
			max=key.length();
			}
		}
		for(Map.Entry entry:tm.entrySet()){
			key=(String)entry.getKey();
			if(key.length()==max){
			System.out.println(key);
			break;
			}
		}
	}	
	testcase--;
	}
	buffer.close();
}
}
