import java.util.Scanner;

public class newpro {
    
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Input the number");
        int k = scan.nextInt();

        System.out.println(print(k));
       
    }
    public static int print(int x){
        
        int total = 50;
           total +=x ;
           return total ;
    }
}
