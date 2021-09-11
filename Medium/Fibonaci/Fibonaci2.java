//recursion method with fibonaci

public class Fibonaci2 {
    public static void main (String args[]){
        int count =10;
        System.out.print(n1+" "+n2); //printing 0 &1
        printFibonaci(count-2); //n-2 because 2 numbers are already printed
    }

    static int n1=0, n2=1, n3=0;
    static void printFibonaci(int count){
        if(count>0){
            n3= n1+n3;
            n1= n2;
            n2 = n3;
            System.out.print(" "+n3);
            printFibonaci(count-1);
        }
    }
}
