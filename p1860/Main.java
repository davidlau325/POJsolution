import java.io.*;
import java.util.*;

public class Main{
	public static final double EPS=1E-8;
	public static void main(String[] args)throws Exception{
	BufferedReader buffer = new BufferedReader(new
InputStreamReader(System.in));

	String read;
	StringTokenizer idata;
	int v,e,start,a,b;
	double initial,rab,cab,rba,cba;
	double[][]edgeR;
	double[][]edgeC;
	double[] vectex;

	read = buffer.readLine();
	idata = new StringTokenizer(read);
	v=Integer.parseInt(idata.nextToken());
	e=Integer.parseInt(idata.nextToken());
	start=Integer.parseInt(idata.nextToken());
	initial = Double.parseDouble(idata.nextToken());
	vectex = new double[v];
	edgeR= new double[v][v];
	edgeC= new double[v][v];
	double convert=0.0;

	for(int i=0;i<e;i++){
		read=buffer.readLine();
		idata=new StringTokenizer(read);
		a=Integer.parseInt(idata.nextToken());
		b=Integer.parseInt(idata.nextToken());
		rab=Double.parseDouble(idata.nextToken());
		cab=Double.parseDouble(idata.nextToken());
		rba=Double.parseDouble(idata.nextToken());
		cba=Double.parseDouble(idata.nextToken());
	edgeR[(a-1)][(b-1)]=rab;
	edgeC[(a-1)][(b-1)]=cab;
	edgeR[(b-1)][(a-1)]=rba;
	edgeC[(b-1)][(a-1)]=cba;
	}
	Arrays.fill(vectex,0);
	vectex[(start-1)]=initial;
	boolean released=false;

	while(vectex[(start-1)]<=initial+EPS){
	released=false;
	int x,y;
	for(x=0;x<v;x++){
		for(y=0;y<v;y++){
		if(edgeR[x][y]!=0){
		convert=(vectex[x]-edgeC[x][y])*edgeR[x][y];
		if(convert>vectex[y]+EPS){
		vectex[y]=convert;
		released=true;
		if(y==(start-1)){break;}
		}
		}
		}
	if(released==true && y==(start-1)){break;}
	}
	if(released==false){break;}
	}
	if(released==true){
	System.out.println("YES");
	}else{
	System.out.println("NO");
	}
	buffer.close();
}
}
