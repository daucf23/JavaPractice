import java.util.Scanner;

public class basicCalculator {

    public static void main(String[] args) {
        System.out.println("select the operation you want to do from the menu");
        System.out.println("1) Addition");
        System.out.println("2) Subtraction");
        System.out.println("3) Multiply");
        System.out.println("4) Divide");

        String optionSelected;
        Scanner scanny = new Scanner(System.in);
        optionSelected = scanny.next();

        switch (optionSelected) {
            case "1":
                adding();
                break;
            case "2":
                subtract();
                break;
            case "3":
                multiply();
                break;
            case "4":
                divide();
                break;
            default:
                break;
        }
        scanny.close();

        
    
    
    }

    private static void divide() {
        Scanner scanny2 = new Scanner(System.in);
        double value1 = 0;
        double value2 = 0;

        System.out.print("Enter the numbers that you want to divide\n");
        value1 = scanny2.nextDouble();
        value2 = scanny2.nextDouble();

        if(value2 == 0 || value2 == 0.0)
        {
            System.out.println("Cannot divide by zero, calculator exiting");
            System.exit(0);
        }

        double result = value1 / value2;
        System.out.println("The result is:\t" + result);
        scanny2.close();
    }

    private static void multiply() {
        Scanner scanny2 = new Scanner(System.in);
        double value1 = 0;
        double value2 = 0;

        System.out.print("Enter the numbers that you want to multiply\n");
        value1 = scanny2.nextDouble();
        value2 = scanny2.nextDouble();

        double result = value1 * value2;
        System.out.println("The result is:\t" + result);
        scanny2.close();
    }

    private static void subtract() {
        Scanner scanny2 = new Scanner(System.in);
        double value1 = 0;
        double value2 = 0;

        System.out.print("Enter the numbers that you want to subtract\n");
        value1 = scanny2.nextDouble();
        value2 = scanny2.nextDouble();

        double result = value1 - value2;
        System.out.println("The result is:\t" + result);
        scanny2.close();
    }

    private static void adding() {
        Scanner scanny2 = new Scanner(System.in);
        double value1 = 0;
        double value2 = 0;

        System.out.print("Enter the numbers that you want to add\n");
        value1 = scanny2.nextDouble();
        value2 = scanny2.nextDouble();

        double result = value1 + value2;
        System.out.println("The result is:\t" + result);
        scanny2.close();
    }
    
}