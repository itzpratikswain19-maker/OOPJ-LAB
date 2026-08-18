
class Assignment1_Q5 {

    public static void main(String[] args) {
        double a = 3.0, b = 4.0, c = 5.0;
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of the triangle: " + area);
    }
}
