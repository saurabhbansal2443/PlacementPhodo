import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> ans = getSubsquence(str);

        System.out.println(ans);

    }

    public static ArrayList<String> getSubsquence(String str) {
        ArrayList<String> ans = new ArrayList<>();

        if(str.length()==0){
            ans.add("");
            return ans ;
        }

        char ch = str.charAt(0);
        String rem = str.substring(1);

        ArrayList<String> rres = getSubsquence(rem);

        for(String s : rres ){
            ans.add(s);
            ans.add(ch+s);
        }

        return ans ;
    }
}
