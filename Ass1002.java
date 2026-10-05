interface Walker {
    default void move() {
        System.out.println("Walking...");
    }
}

interface Swimmer {
    default void move() {
        System.out.println("Swimming...");
    }
}

class Duck implements Walker, Swimmer {
    @Override
    public void move() {
        Walker.super.move();
        Swimmer.super.move();
    }
}

public class Ass1002 {
    public static void main(String[] args) {
        Duck d1 = new Duck();
        d1.move();
    }
}
