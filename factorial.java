public class factorial {
    public static void main(String[] args) {
        int n = 6;

        int ans = fact(n);

        System.out.println(ans);

    }

    public static int fact(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        int pre = fact(n - 1);
        int ans = n * pre;

        return ans;
    }

}
