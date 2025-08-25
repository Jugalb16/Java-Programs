// Program to use interface

interface Player {
    void run();  
}
class Dhoni implements Player {
    public void run() {
        System.out.println("Dhoni scores 91 runs");
    }
}

class Raina implements Player {
    public void run() {
        System.out.println("Raina scores 87 runs");
    }
}

public class Program_1 {
    public static void main(String[] args) {
        Player myDhoni = new Dhoni();  
        Player myRaina = new Raina();  

        myDhoni.run();  
        myRaina.run(); 
    }
}
