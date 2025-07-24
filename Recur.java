package practivejava;

import java.util.*;

public class Recur {
	void f(int i, int n) {
		if (i < 1) 
			return; 
		f(i - 1, n);
		System.out.print(i+" ");
	}
	public static void main(String[] args) {
		Recur r=new Recur();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		r.f(n, n);
        s.close();
	}
}




