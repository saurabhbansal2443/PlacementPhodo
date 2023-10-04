public class ReverseAString {
    public static void main(String[] args) {
        String str = "game";

        String ans = reverse(str , str.length()-1);
   
        System.out.println(ans);
        
    }

    public static String reverse(String str , int idx  ) {

        if(idx==-1){
            return "";
        }

       char ch = str.charAt(idx);

       String rem = reverse(str,idx-1);

       String ans = ch + rem ;

       return ans ;

       
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
