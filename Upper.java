package practivejava;
import java.util.*;
public class Upper {
	void cntUpper(String[] str) {
		for(int i=0;i<str.length;i++) {
			int cnt=0;
			for(int j=0;j<str[i].length();j++) {
				char ch=str[i].charAt(j);
				if(ch>='A' && ch<='Z')
					cnt++;
					
			}
			System.out.println(cnt);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.nextLine();
		String[] str=new String[n];
		for(int i=0;i<n;i++) {
			str[i]=s.nextLine();
		}
		Upper u=new Upper();
		u.cntUpper(str);
		s.close();
	}

}
