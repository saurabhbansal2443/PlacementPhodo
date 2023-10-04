public class printn2 {
    public static void main(String[] args) {
        int n = 4;

        print(n);
    }

    public static void print(int n) {

        if (n <= 0) {
            return;
        }

        print(n - 1);

        System.out.println(n);
    }
}