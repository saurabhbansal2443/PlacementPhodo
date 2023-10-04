import java.util.*;
public class getMazePath {
    public static void main(String[] args) {
        
        ArrayList<String> ans = getPath(0,0,2,2);

        System.out.println(ans);
    }

    public static ArrayList<String> getPath(int sr , int sc , int dr , int dc){
        ArrayList<String> ans = new ArrayList<>();

        if(sr==dr && sc==dc){
            ans.add("");
            return ans ;
        }

        if(sr>dr || sc>dc){
               return ans ;
        }

        ArrayList<String> hlist = getPath(sr, sc+1, dr, dc);
        ArrayList<String> vlist = getPath(sr+1, sc, dr, dc);
         ArrayList<String> dlist = getPath(sr+1, sc+1, dr, dc);

        for(String s : hlist){
            ans.add("H"+s);
        }

          for(String s : vlist){
            ans.add("V"+s);
        }

         for(String s : dlist){
            ans.add("D"+s);
        }

        return ans ;
    }
}
