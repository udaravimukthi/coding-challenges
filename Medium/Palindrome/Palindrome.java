//A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward,
import java.util.Scanner;
public class Palindrome {
    public static void main (String args[]){
        int r,sum=0,temp;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check :");
        int n = scan.nextInt();

        temp = n;
        while(n>0){
            r= n%10; // getting remainder
            sum = (sum*10) + r;
            n = n/10;
        }

        if(temp==sum){
            System.out.println("Palindrome number");
        }else{
            System.out.println("not palindrome");
        }
        

    }
}
