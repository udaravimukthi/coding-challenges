public class ArrayRotation {
    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        ArrayRotation rotate = new ArrayRotation();
        rotate.leftRotate(arr, 2, 7);
        rotate.printArray(arr, 7);
    }

    void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
