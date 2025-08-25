// Extend one interface to another

interface InterfaceA {
    void methodA();
}

interface InterfaceB extends InterfaceA {
    void methodB();
}

class MyClass implements InterfaceB {
    @Override
    public void methodA() {
        System.out.println("Implementation of methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Implementation of methodB");
    }
}

public class Program_2 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.methodA();  
        obj.methodB(); 
    }
}
