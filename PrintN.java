import java.util.ArrayList;

public class PrintN {
    public static void main(String[] args) {
        int n = 4;

        ArrayList<String> ans =printPath(n);

        System.out.println(ans);
    }

    public static ArrayList<String> printPath(int n) {

        if (n == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        } else if (n < 0) {
            ArrayList<String> base = new ArrayList<>();
            return base;
        }

        ArrayList<String> path1=printPath(n-1);
        ArrayList<String> path2=printPath(n-2);
        ArrayList<String> path3=printPath(n-3);

        ArrayList<String> ans = new ArrayList<>();

        for(String s:path1){
            ans.add(1+s);
        }

        for(String s:path2){
            ans.add(2+s);
        }

        for(String s:path3){
            ans.add(3+s);
        }

        return ans ;
    }
}
