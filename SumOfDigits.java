public class SumOfDigits {
    public static void main(String[] args) {
        int n = 2534;
        int ans = sum(n);
        System.out.println(ans);
    }

    public static int sum(int n){

        if(n>=0 && n<=9){
            return n;
        }

        int digit = n%10;
        int rem= n/10;

        int preSum = sum(rem);

        int ans = digit + preSum;

        return ans ;
    }
}
