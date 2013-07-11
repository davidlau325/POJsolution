import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.math.*;

public class Main{
	static class Range implements Comparable<Range>{
		double left,right;
		public Range(double left,double right){
		this.left=left;
		this.right=right;
		}
		@Override
		public int compareTo(Range range){
		if(range.left==left){
		return ((Double)right).compareTo((Double)(range.right));
		}else{
		return ((Double)left).compareTo((Double)(range.left));
		}
		}

		public String toString(){
		return "("+left+","+right+")";
		}
	}

	private static int compute(Range[] ranges){
		int num=1;
		int n = ranges.length;
		Range preRange = ranges[0],range;
		for(int i=1;i<n;i++){
			range=ranges[i];
		if(range.left>=preRange.left && range.left <= preRange.right){
			preRange.left = range.left;
			if(range.right<preRange.right){
			preRange.right = range.right;
			}
		}else{
		num++;
		preRange=range;
		}
		}
	return num;
	}

	public static void main(String[] args)throws Exception{
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

	String read;
	StringTokenizer idata;
	int islands,distance,i,x,y,num;
	int casecount=0;
	double dx;
	Range[] ranges;
	while(!(read=buffer.readLine()).equals("0 0")){
		idata = new StringTokenizer(read);
		islands = Integer.parseInt(idata.nextToken());
		distance = Integer.parseInt(idata.nextToken());
		casecount++;
		num=0;
		ranges = new Range[islands];
		for(i=0;i<islands;i++){
		read = buffer.readLine();
		idata = new StringTokenizer(read);
		x = Integer.parseInt(idata.nextToken());
		y = Integer.parseInt(idata.nextToken());
		if(y>distance){num=-1;}	
		dx = Math.sqrt(distance*distance - y*y);
		ranges[i]=new Range(x-dx,x+dx);
		}
	Arrays.sort(ranges);
	if(num!=-1){num=compute(ranges);}
	System.out.println("Case "+casecount+": "+num);
	buffer.readLine();
	}
	buffer.close();
}
}
