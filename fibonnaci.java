public class fibonnaci {
    public static void main(String[] args) {
        int n = 8;

        int ans = fib(n);

        System.out.println(ans);

    }

    public static int fib(int n){

        if(n==1) {
            return 0;
        }else if(n==2){
            return 1;
        }else{
            int spre=fib(n-2);
            int pre = fib(n-1);

            int ans = spre + pre;

            return ans ;
        }
    }
}
