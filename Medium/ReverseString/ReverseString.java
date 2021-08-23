//method 1

import java.util.Scanner;

public class ReverseString {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word");
        String s = scan.nextLine();
        System.out.println("The inserted word is: " +s);
        String reverse = "";

        for (int i= s.length()-1; i>=0; i--){
            reverse += s.charAt(i);
        }
        System.out.println("The reverse of the word is :" +reverse);

    }   
}
