import java.util.Scanner;

public class InsertionSort {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int [] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++)
        {
        System.out.println("Please enter number");
        numbers[i] = sc.nextInt();
        }

        //int arr[] = {12,11,13,5,6};
        InsertionSort ob = new InsertionSort();
        ob.sort(numbers);
        printArray(numbers);
    }

    void sort(int arr[]){
        int n = arr.length;
        for(int i=1; i<n; ++i){
            int key = arr[i];
            int j = i-1;

            while (j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1] = key;

        }
    } 

    static void printArray(int arr[]){
        int n = arr.length;
        for (int i=0; i<n ; ++i){
            System.out.print(arr[i] + " ");
        //System.out.println();
        }
    }
}
