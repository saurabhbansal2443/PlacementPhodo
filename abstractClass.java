public class abstractClass {
    public static void main(String[] args) {
        
    }
}

abstract class Phone{
    abstract void call();
    abstract void dial();

    void music (){
        System.out.println(" Playing Music ");
    }
}

 class SmartPhone extends Phone{
    void call(){

    }

    void dial(){
        
    }
}
