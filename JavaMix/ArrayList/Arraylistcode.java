//array list dynamic array for storing elements, no size limit
//arraylist can contain duplicate elements, maintains insertion order, non synchronized

import java.util.*;

public class Arraylistcode {
    public static void main(String args[]) {
        ArrayList<String> arl = new ArrayList<>();
        arl.add("Mango");
        arl.add("Apple");
        arl.add("Banana");
        arl.add("Grapes");

        System.out.println(arl);

        // sorting the arrayliist
        Collections.sort(arl);
    }

}
