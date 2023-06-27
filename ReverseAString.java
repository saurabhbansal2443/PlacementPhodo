public class ReverseAString {
    public static void main(String[] args) {
        String str = "Hello";

        // String ans = reverse1(str);
        // System.out.println(ans);

        String ans2 = reverse2(str,str.length()-1);
        System.out.println(ans2);

        String ans3 = "";

        reverse3(str, str.length() - 1,ans3);
        
        
    }

    public static String reverse1(String str) {

        if (str.length() == 0 || str.length() == 1) {
            return str;
        }

        char ch = str.charAt(str.length() - 1);

        String rem = str.substring(0, str.length() - 1);

        String remAns = reverse1(rem);

        String ans = ch + remAns;

        return ans;
    }

    public static String reverse2(String str, int idx) {
        if(str.length()==1){
            return str;
        }else if (idx == -1) {
            return "";
        }
        char ch = str.charAt(idx);
        String ans2= reverse2(str, idx - 1);
        return ch+ans2;
    }

    public static void reverse3(String str, int idx , String ans ) {
        if (idx == -1) {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(idx);
        
        reverse3(str, idx-1, ans+ch);

      
    }
}
