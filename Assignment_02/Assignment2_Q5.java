
class Assignment2_Q5 {

    public static void main(String args[]) {
        int min = 547200;
        int total_days = min / 1440;
        int year = total_days / 365;
        int day = total_days % 365;
        System.out.println(min + " minute is total " + year + " year and " + day + " days.");
    }
}
