/* WAP to sort a integer array . */
import java.util.Scanner;

public class Assignment6_Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of an array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before sorting: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < size - 1; i++) {
            int m = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[m]) {
                    m = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[m];
            arr[m] = temp;
        }
        System.out.println("Array after selection sort: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
