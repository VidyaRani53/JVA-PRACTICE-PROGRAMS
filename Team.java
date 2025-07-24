package practivejava;

public class Team{
    static int i = 1;
    static void rec(int x) {
        if (x >= 1) return;
        System.out.print(i);
        i += 2;
        rec(i);
    }
    public static void main(String[] args) {
        rec(1);
    }
}


