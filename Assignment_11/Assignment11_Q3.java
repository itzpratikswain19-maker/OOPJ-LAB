
class Assignment11_Q3 {

    public static void main(String args[]) {
        String s = "apple";

        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + ": ");

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) {
                    System.out.println(i + " ");
                }
            }

            System.out.println();
        }
    }
}
