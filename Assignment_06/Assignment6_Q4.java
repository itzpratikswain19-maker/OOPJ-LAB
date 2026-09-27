/* WAP to find duplicate values in an array of integer value. */
import java.util.*;

class Assignment6_Q4 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements of an array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Duplicate elements are: ");
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size - 1; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[j] + " ");
                    break;
                }
            }
        }
    }
}
