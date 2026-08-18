/* Write a java program to search for an element using binary search */
import java.util.*;
class Assignment5_Q4{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size = sc.nextInt();
        int arr[] = new int [size];
        System.out.println("Enter Elements of an array: ");
        for (int i = 0;i < size; i++){
            arr[i] = sc.nextInt();
        }
        int beg = 0, end = arr.length - 1, mid = (end + end) / 2;
        System.out.println("Enter a number to search: ");
        int n = sc.nextInt();
        while (beg <= end && arr[mid] != n){
            if (n < arr[mid]){
                end = mid - 1;
            }
            if (n > arr[mid]){
                beg = mid + 1;
            }
            mid = (beg + end) / 2;
        }
        if (arr[mid] == n){
            System.out.println(n + " is found at index: " + mid);
        }else{
            System.out.println(n + " is not found");
        }
    }
}