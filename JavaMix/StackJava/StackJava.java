import java.util.*;
import java.io.*;

public class StackJava {
    public static void main(String args[]) {
        Stack stk = new Stack();

        Stack<String> stk2 = new Stack<>();

        // pushing the elements
        stk.push(4);
        stk.push("All");
        stk.push("Geeks");

        stk2.push("Geeks");
        stk2.push("For");

        System.out.println(stk);
        System.out.println(stk2);
    }
}
