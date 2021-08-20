
// Finding perfect square numbers in a range using Java

import java.io.IOException;
public class SquareNumbersInRange {
    public static void main (String args[]) throws IOException{
        int starting_number = 1;
        int ending_number = 100;
        System.out.println("Perfect Numbers between" +starting_number+  " and" +ending_number);

        for (int i = starting_number; i <= ending_number; i++){
            int number = i;

            int sqrt = (int) Math.sqrt(number);

            if(sqrt*sqrt == number) {
                System.out.println(number+ " = " +sqrt+ "*" +sqrt);
            }
        }
    }

}

// output
// Perfect Numbers between1 and100
// 1 = 1*1
// 4 = 2*2
// 9 = 3*3
// 16 = 4*4
// 25 = 5*5
// 36 = 6*6
// 49 = 7*7
// 64 = 8*8
// 81 = 9*9
// 100 = 10*10
