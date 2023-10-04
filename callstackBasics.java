public class callstackBasics{
    public static void main(String[] args) {
        System.out.println("I am Start ");
        method1();
        System.out.println("I am end ");
    }

    public static void  method1(){
        System.out.println("I am first");
        method2();
        System.out.println("First function ends here ");
    }

     public static void  method2(){
        System.out.println("I am Second");
        method3();
        System.out.println("second function ends here ");
        
    }

     public static void  method3(){
        System.out.println("I am third");
        
    }
}