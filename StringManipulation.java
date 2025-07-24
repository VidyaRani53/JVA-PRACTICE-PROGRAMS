package practivejava;

public class StringManipulation {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");
        String str4 = str3.substring(0, 3);
        
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str3));
        System.out.println(str3 == str4);
        System.out.println(str1 == str4);
    }
}