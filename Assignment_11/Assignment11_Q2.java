
class Assignment11_Q2 {

    public static void main(String args[]) {
        String S1 = "hello";
        String S2 = "hello";

        boolean ans = true;

        if (S1.length() != S2.length()) {
            ans = false;
        } else {
            for (int i = 0; i < S1.length(); i++) {
                if (S1.charAt(i) != S2.charAt(i)) {
                    ans = false;
                    break;
                }
            }
        }

        if (ans) {
            System.out.println("Contain Same Data");
        } else {
            System.out.println("Not Equal");
        }
    }
}
