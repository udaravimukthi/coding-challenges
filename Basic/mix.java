import java.util.Random;

public class mix {
    
    public static void main (String args[]){
        Random rnd = new Random();
        System.out.println("Print 10 random numbers");
        int num;
        for(int i=0; i<10; i++){
            num = rnd.nextInt(20);
            System.out.println(num);

        }
    }
}
