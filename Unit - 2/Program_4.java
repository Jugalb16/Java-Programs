// Multilevel inheritance

class Cricket {
    void play() {
        System.out.println("Playing cricket.");
    }
}

class Batsman extends Cricket {
    void bat() {
        System.out.println("Batsman is batting.");
    }
}

class Captain extends Batsman {
    void lead() {
        System.out.println("Captain is leading the team.");
    }
}

public class Program_4 {
    public static void main(String[] args) {
        Captain captain = new Captain();

        captain.play();  // From Cricket class
        captain.bat();   // From Batsman class
        captain.lead();  // From Captain class
    }
}
