public class basics {
    public static void main(String[] args) {
        System.out.println("main started ");
        firstFunction();
        System.out.println("main end ");
    }

    public static void firstFunction() {
        System.out.println("First function called start");
        secondFunction();
        System.out.println("First function called end");

    }

    public static void secondFunction() {
        System.out.println("Second function called");

    }
}