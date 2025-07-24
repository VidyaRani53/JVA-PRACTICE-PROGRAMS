package practivejava;

public class SM {
    public static void main(String[] args) {
        String s1 = "Ja" + "va";
        String s2 = "Java";
        final String s3 = "Ja";
        final String s4 = "va";
        String s5 = s3 + s4;
        String s6 = new String("Java");
        String s7 = s6.intern();
        System.out.println((s1 == s2) + " " + (s1 == s5) + " " + (s2 == s6) + " " + (s2 == s7));
    }
}


