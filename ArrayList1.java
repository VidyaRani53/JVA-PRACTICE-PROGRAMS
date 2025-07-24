package practivejava;

import java.util.*;

public class ArrayList1 {
    public static void main(String...gecit ) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)); 
        a.removeIf(n -> n % 2 == 0);  
        a.add(1, 6);
        a.add(3);
        a.remove(Integer.valueOf(3));
        a.add(a.indexOf(5), 7);
        a.set(0, 4);
        a.add(0,1);
        System.out.println(a);
    }
}



