package practivejava;
import java.util.*;
public class LCS1 {
	int lcs(String s1,String s2) {
		int n=s1.length();
		int m=s2.length();
		int cur[]=new int[n+1];
		int prev[]=new int[n+1];
		
		for(int i=1;i<=n;i++){//i is for iterating string1
			for(int j=1;j<=m;j++) {//j is for iterating string2
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					cur[j]=1+prev[j-1];
				}
				else
					cur[j]=Math.max(cur[j-1],prev[j]);
			}
			int temp[]=cur;
			prev=temp;
		}
		return cur[n];	
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		LCS1 l=new LCS1();
		String s1=s.next();
		String s2=s.next();
		System.out.println("Length of LCS is:"+l.lcs(s1,s2));
		s.close();
	}

}
