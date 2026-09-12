/*Write a java program to sort the elements using bubble sort.*/
class Assignment5_Q3{
    public static void main(String args[]){
        int arr[] = {9, 10, 2, 7, 5};
        int ub = arr.length;
        System.out.println("Before Sorting: ");
        for (int i = 0; i < ub; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int temp = 0;
        for (int k = 0; k < ub - 1; k++){
            for (int i = 0; i < ub - k - 1; i++){
                if (arr[i] > arr[i + 1]){
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println("After Sorting: ");
        for (int i = 0; i < ub; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
