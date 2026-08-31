class Interest {

    void si(double principal, int time) {

        double rate = 5;

        double si = (principal * rate * time) / 100;

        System.out.println("Simple Interest = " + si);
    }

    void si(int rate, int time) {

        double principal = 10000;

        double si = (principal * rate * time) / 100;

        System.out.println("Simple Interest = " + si);
    }

    public static void main(String[] args) {

        Interest obj = new Interest();

        obj.si(50000, 2);

        obj.si(8, 2);
    }
}
