package practivejava;

public class Loop{
    static int i = 1;
    
    public static void main(String[] args) {
        new Loop().loop();
    }
     void loop() {
        while (check() && i++ < 10) {
            System.out.print(i);
        }
    }
    boolean check() {
        return (i += 2) % 3 != 0;
    }
}

