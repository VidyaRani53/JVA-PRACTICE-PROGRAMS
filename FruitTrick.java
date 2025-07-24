package practivejava;

import java.util.*;

interface Fruit{
    String fruit(String fruit);
}

public class FruitTrick {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Mango"));
        Fruit slicer = f -> f.substring(2).toUpperCase();
        Fruit doubler = f -> f + f.length();
        fruits.replaceAll(f -> (f.length() % 2 == 0) ? slicer.fruit(f) : doubler.fruit(f));
        fruits.removeIf(f -> f.contains("6"));
        fruits.forEach(System.out::println);
    }
}



