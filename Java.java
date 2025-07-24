package practivejava;

public class Java {
    private int i = 1;
    public static void main(String[] args) {
        Java j = new Java();
        j.loop();
    }
    void loop() {
        for (increment(); i < 10; increment()) {
            System.out.print(i);
        }
    }
    private void increment() {
        i += 2;
    }
}


