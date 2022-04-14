public class workingWithVariables {

    //working with creating and manipulating variables
    //start with setting variables. then lets add operations to the variable

    public static int integer1 = 64;
    public static String string1 = new String("55");
    public static double double1 = 6.4;

    public static void main(String[] args) {

        //Print out the different variables
        System.out.println(integer1 + "\t" + string1 + "\t" + double1);

        badMath(integer1, string1, double1);
        
    }

    private static void badMath(int int1, String str1, double doub1) {
        //here we are casting an int and double, and adding them together
        int sum = (int) (int1 + doub1);
        //this is bad as the result of the operation drops the decimal value of the double
        System.out.println(int1 + "+" + doub1 +  "="  + sum);
        System.out.println("This is incorrect, as vasting to an int with a double causes us to drop the .4 decimal value" +"\nLets try this differnetly");

        goodCastMath(int1, doub1);

    }

    private static void goodCastMath(int int1, double doub1) {
        double sum = (double) (int1 + doub1);
        System.out.println(int1 + "+" + doub1 +  "="  + sum);
        System.out.println("This is the correct way to cast and prevent losing information when performing an opetation on the values assigned to variables");
    }

    
}
