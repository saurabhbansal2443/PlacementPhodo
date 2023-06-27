public class power {
    public static void main(String[] args) {
        int n = 3;
        int x = 4;

        int ans = find2(n, x);

        System.out.println(ans);

    }

    public static int find1(int n, int x) {

         

        int rem = find1(n, x - 1);
        int ans = n * rem;

        return ans;
    }

    public static int find2(int n , int x){
       if (x == 1) {
            return n;
        } else if (x == 0 || n == 1) {
            return 1;
        } 

        int rres = find2(n,x/2);

        if( x%2==0){
            int ans = rres*rres;
            return ans ;
        }else{
             int ans = rres*rres * n;
            return ans ;
        }
    }
}
