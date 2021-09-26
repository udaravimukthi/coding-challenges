public class ArrayReverse {
    public static void main(String args[]) {
        int[] arr = { 2, 5, 7, 9, 8 };
        reverse(arr, arr.length);

    }

    static void reverse(int arr[], int n){

        int[] b = new int[n];
        int j = n ;
        for(int i=0; i<n ; i++){
            b[j-1] = arr[i];
            j = j-1;
        }

        System.out.println("Reversed array is :");
        for (int k =0 ; k<n; k++){
            System.out.println(b[k])
        }
    }
}
