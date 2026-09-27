/* WAP to fond common element btw two arrays(String valus). */
import java.util.*;

class Assignment6_Q5 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array: ");
        int size1 = sc.nextInt();
        String a[] = new String[size1];
        System.out.println("Enter elements of an array: ");
        for (int i = 0; i < size1; i++) {
            a[i] = sc.next();
        }
        System.out.println("Enter size of second array: ");
        int size2 = sc.nextInt();
        String b[] = new String[size2];
        System.out.println("Enter elements of an array: ");
        for (int i = 0; i < size2; i++) {
            b[i] = sc.next();
        }
        System.out.println("Common values are: ");
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (a[i].equals(b[j])) {
                    System.out.println(b[j]);
                    break;
                }
            }
        }
    }
}
