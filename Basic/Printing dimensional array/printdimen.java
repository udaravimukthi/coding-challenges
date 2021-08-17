
public class printdimen {

    public static void main (String args[]){
        int array[][] = {{1,2,3},{3,4,6,7},{7,6,0,1,4}};

        int num[][] = {{23},{2,4,5},{2,2}};

        System.err.println("print array");
        print(array);

        System.err.println("print num");
        print(num);
    }

    public static void print(int x[][]){

        for(int row=0; row<x.length; row++){
            for(int col=0; col< x[row].length; col++){
                System.out.print(x[row][col] + "\t");
            }
            System.err.println("");
        }

    }
    
}
