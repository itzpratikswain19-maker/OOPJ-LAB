/* Write a java program to create and display a unique three-digit number using the digits 1, 2, 3. Also count how many three-digit numbers are there */
import java.util.*;
class Assignment5_Q5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Unique three-digit numbers using digits 1, 2, 3:");
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 3; j++){
                for(int k = 1; k <= 3; k++){
                    if(i != j && j != k && k != i){
                        System.out.print(i + "" + j + "" + k + " ");
                        count++;
                    }
                }
            }
        }
        System.out.println("\nTotal count of unique three-digit numbers are: " + count);
    }
}