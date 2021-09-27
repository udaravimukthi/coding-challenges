public class DupInArray {
    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 4, 3, 6, 7, 8, 8, 9 };

        System.out.print("Print duplicated numbers in array: \n");
        duplicate(arr);
    }

    static void duplicate(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
