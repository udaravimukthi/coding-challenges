public class Bubblesort {
    public static void main(String args[]){
        Bubblesort ob = new Bubblesort();
        int arr[] = {64,34,25,12,22,11,90};
        ob.Bubblesort(arr);
        ob.printArray(arr);
    }

    void Bubblesort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]> arr[j+1]){
                    //swap arr[j+1] and arr[j]
                   int temp =arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                }
            }
        }
    }

    void printArray(int arr[]){
        int n= arr.length;
        for(int i=0;i<n; ++i){
            System.out.print(arr[i] + " ");
            
        //System.out.println();
        }

    }
}
