
class Assignment11_Q1 {

    public static void main(String args[]) {
        String S1 = "This is Exercise 1";
        String S2 = "This is Exercise 2";

        int ans = 0;

        for (int i = 0; i < S1.length() && i < S2.length(); i++) {
            if (S1.charAt(i) != S2.charAt(i)) {
                ans = S1.charAt(i) - S2.charAt(i);
                break;
            }
        }

        if (ans == 0) {
            if (S1.length() < S2.length()) {
                ans = -1;
            } else if (S1.length() > S2.length()) {
                ans = 1;
            }
        }

        if (ans < 0) {
            System.out.println(S1 + " is less then " + S2);
        } else if (ans > 0) {
            System.out.println(S1 + " more then " + S2);
        } else {
            System.out.println("Both are equal");
        }
    }
}
