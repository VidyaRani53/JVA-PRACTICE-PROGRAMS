package practivejava;

public class Str {
    public static void main (String [] geek) {
        StringBuilder sb1 = new StringBuilder ("Riya Ekkadaaaa");
        StringBuilder sb2 = new StringBuilder("Riya Ekkadaaaa");
        sb1.append("is awesome").append("and cool").insert(4,"the great");
        sb2.insert(3, "Welcome to").append("and fantastic").delete(0, 9);
        System.out.println(sb1); 
        System.out.println(sb2);         	
       System.out.println(sb1.toString().equals(sb2.toString()));         	
       System.out.println(sb1 == sb2); 
    }
}


