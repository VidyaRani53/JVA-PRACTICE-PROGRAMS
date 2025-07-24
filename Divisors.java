package practivejava;
import java.util.*;
public class Divisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		ArrayList<Integer> ls=new ArrayList<>();
		for(int i=1;i*i<=n;i++) {
			if(n%i==0) {
				ls.add(i);
			}
			if(n/i!=i) {
				ls.add(n/i);
			}
		}
		Collections.sort(ls);
		System.out.println(ls);
		

	}

}
