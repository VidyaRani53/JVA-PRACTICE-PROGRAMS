package practivejava;
import java.util.*;
public class LCS {
	int lcs(String s1,String s2) {
		int n=s1.length();
		int m=s2.length();
		int dp[][]=new int[n+1][m+1];
		
		for(int i=1;i<=n;i++){//i is for iterating string1
			for(int j=1;j<=m;j++) {//j is for iterating string2
				if(s1.charAt(i-1)==s2.charAt(j-1)) 
					dp[i][j]=1+dp[i-1][j-1];
				else
					dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
			}
		}
		return dp[n][m];
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		LCS l=new LCS();
		String s1=s.next();
		String s2=s.next();
		System.out.println("Length of LCS is:"+l.lcs(s1,s2));
		s.close();
	}

}
