import java.io.*;
import java.util.*;

public class Main{
	static int compute(char[] check,char p,char q,char r,char s,char t){
		Stack<String> st = new Stack<String>();
		String p1 = Character.toString(p);
		String q1 = Character.toString(q);
		String r1 = Character.toString(r);
		String s1 = Character.toString(s);
		String t1 = Character.toString(t);
		int i;
		String out1="";
		String out2="";
		for(i=((check.length)-1);i>-1;i--){
			if(check[i]=='p'){st.push(p1);}
			else if(check[i]=='q'){st.push(q1);}
			else if(check[i]=='r'){st.push(r1);}
			else if(check[i]=='s'){st.push(s1);}
			else if(check[i]=='t'){st.push(t1);}
			else if(check[i]=='K'){
			out1=st.pop();
			out2=st.pop();
				if((out1.equals("1"))&&(out2.equals("1"))){
				st.push("1");
				}else{
				st.push("0");
				}}
			else if(check[i]=='A'){
			out1=st.pop();
			out2=st.pop();
				if((out1.equals("0"))&&(out2.equals("0"))){
				st.push("0");
				}else{
				st.push("1");
				}}
			else if(check[i]=='N'){
			out1=st.pop();
				if(out1.equals("1")){
				st.push("0");
				}else{
				st.push("1");
				}}
			else if(check[i]=='C'){
			out1=st.pop();
			out2=st.pop();
				if(out1.equals("1")&&out2.equals("0")){
				st.push("0");
				}else{
				st.push("1");
				}
				}
			else if(check[i]=='E'){
			out1=st.pop();
			out2=st.pop();
				if(out1.equals(out2)){
				st.push("1");
				}else{
				st.push("0");
				}
			}
		}
	if(st.peek().equals("0")){
	return 0;
	}else{
	return 1;
	}
	}
	public static void main(String[] args)throws Exception{
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	String read;
	char[] check;
	int a,b,c,d,e;
	char p,q,r,s,t;
	int output=1;
	while(!(read=buffer.readLine()).equals("0")){
		check=read.toCharArray();
		for(a=0;a<2;a++){
			if(a==0){p='0';}else{p='1';}
			for(b=0;b<2;b++){
				if(b==0){q='0';}else{q='1';}
				for(c=0;c<2;c++){
					if(c==0){r='0';}else{r='1';}
					for(d=0;d<2;d++){
						if(d==0){s='0';}else{s='1';}
						for(e=0;e<2;e++){
							if(e==0){t='0';}else{t='1';}
						output=compute(check,p,q,r,s,t);
						if(output==0){
						System.out.println("not");
						break;
						}
						}
					if(output==0){break;}
					}
				if(output==0){break;}
				}
			if(output==0){break;}
			}
		if(output==0){break;}
		}
		if(output==1){
		System.out.println("tautology");
		}	
	}
	buffer.close();
}
}
