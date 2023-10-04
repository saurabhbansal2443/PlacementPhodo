import java.util.*;

public class staircase {
    public static void main(String[] args) {
        int n = 4;

        ArrayList<String> ans = getPath(n);
        System.out.println(ans);
    }

    public static ArrayList<String> getPath(int n) {
        ArrayList<String> ans = new ArrayList<>();
        if (n == 0) {
            ans.add("");
            return ans;
        } else if (n < 0) {
            return ans;
        }

        ArrayList<String> ans1 = getPath(n - 1);
        ArrayList<String> ans2 = getPath(n - 2);
        ArrayList<String> ans3 = getPath(n - 3);

        for(String s : ans1){
            ans.add("1"+s);
        }
         for(String s : ans2){
            ans.add("2"+s);
        }
         for(String s : ans3){
            ans.add("3"+s);
        }

        return ans ;
    }
}
