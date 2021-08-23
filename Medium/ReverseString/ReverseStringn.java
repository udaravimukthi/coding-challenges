public class ReverseStringn{
    public static void  main(String args[]){
        String s = "Hello";
        System.out.println("The word is" +s);
        String reverse = reverseString(s);
        System.out.println("the reversed word is " +reverse);
    }

    public static String reverseString(String word){

        if(word.isEmpty()){
            System.out.println("String in now empty");
            return word;
        }

        System.out.println("String to be passed in Reverse function" + word.substring(1));
        return reverseString(word.substring(1) + word.charAt(0));

    }
}