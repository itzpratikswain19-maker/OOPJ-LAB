
class Assignment11_Q5 {

    public static void main(String args[]) {
        String s = "aabbbccc";

        int man = 0;
        int sman = 0;

        int mch = ' ';
        int smch = ' ';

        for (int i = 0; i < s.length(); i++) {
            int count = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }

            if (count > man) {
                sman = man;
                smch = mch;

                man = count;
                mch = s.charAt(i);
            }
        }

        System.out.println("Second most frequent character: " + (char) smch);
    }
}
