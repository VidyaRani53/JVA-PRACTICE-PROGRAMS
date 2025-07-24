package practivejava;
import java.util.*;
public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		Recursion r=new Recursion();
		r.fun(1,n);
	}
	void fun(int i,int n) {
		if(i>n) {
		return;	
		}
		System.out.println("Rani");
		fun(i+1,n);
		
	}

}
