// Simple Inheritance

// Parent class
class Cricket {
    void player() {
        System.out.println("The player plays cricket.");
    }
}

// Child class inherits from Cricket
class batsman extends Cricket {
    void hits() {
        System.out.println("The batsman hits the ball.");
    }
}

public class Program_3 {
    public static void main(String[] args) {
        batsman mybatsman = new batsman();

        mybatsman.player();

        mybatsman.hits();
    }
}
