class Bank {
    double rate() {
        return 0.0;
    }
}

class SBI extends Bank {
    @Override
    double rate() {
        return 8.4;
    }
}

class ICICI extends Bank {
    @Override
    double rate() {
        return 7.3;
    }
}

class Axis extends Bank {
    @Override
    double rate() {
        return 9.7;
    }
}

public class Ass1001 {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new ICICI();
        Bank b3 = new Axis();

        System.out.println("SBI Rate of Interest: " + b1.rate() + "%");
        System.out.println("ICICI Rate of Interest: " + b2.rate() + "%");
        System.out.println("Axis Rate of Interest: " + b3.rate() + "%");
    }
}
