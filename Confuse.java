package practivejava;


interface Bujji {  
    void message();
}
abstract class Parent implements Bujji{
    Parent() {
        System.out.println("Bangaram okati cheppana....");
    }
}
class Child extends Parent { 
    
    Child() {
        System.out.println("Cheppu bujji kanna....");
    }
    public void message() {
        System.out.println("Emledhule ni pani chusuko....");
    }    
}
public class Confuse{
    public static void main(String[] args) {
        Child obj = new Child();  
        obj.message();  
    }
}


