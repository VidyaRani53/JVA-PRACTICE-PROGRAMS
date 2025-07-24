package practivejava;

public class Mystery{
    public static void main(String[] args) {
        int i = 0;
        for (mysteryPrint(i); i < 5; printNumber(++i), mysteryPrint(i)) {
            printNumber(i++);     }
    }
    static void mysteryPrint(int i) {
        System.out.print("M" + i + " ");
    }
    static void printNumber(int i) {
        System.out.print("P" + i + " ");
    }
}

