public class MergeSort {

    public static void main(String args) {

        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given Array");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\n Sorted Array");
        printArray(arr);
    }

    static void printArray(int arr[]){
        int n = arr.length;
        for(int i =0; i<n; ++i){
            System.out.print(arr[i] + " ")
        }

    }
}
