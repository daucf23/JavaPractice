import java.lang.reflect.Array;

/**
 * multiplicationTable
 */
public class multiplicationTable {

    public static void main(String[] args) {
        //this will be utilizing a loop to be able to print out multiplication tables
        for(int i = 1; i<=10; i++){
            for(int j = 1; j<=10; j++){
               System.out.printf("%d * %d = %d", i, j, i*j).println(); 
            }   
        }
    }
}