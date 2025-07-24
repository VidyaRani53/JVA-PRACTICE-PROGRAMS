package practivejava;
import java.util.*;
public class Unique {
	        int cntUnique(String str) {
	        	HashSet<Character> s=new HashSet<Character>();
	        	for(int i=0;i<str.length();i++) {
	        		s.add(str.charAt(i));
	        	}
	        	return s.size()
;	        }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		Unique u=new Unique();
		System.out.println(u.cntUnique(str));
	}

}
