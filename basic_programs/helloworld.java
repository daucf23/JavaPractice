public class helloworld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        function1();
        function2();
    }

    private static void function1() {
        System.out.println("Hello Function1!");
    }

    private static void function2() {
        String message = new String("Hello Function2 String!");
        System.out.println(message);
    }
}