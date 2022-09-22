public class PowerSets {
    public static void main(String[] arg){
        String s = "abc";
        powersets(s, 0, "");

    }
    public static void powersets(String s,int i, String ans){
        if(i == s.length()){
            System.out.println(ans);
            return;
        }
        char curr = s.charAt(i);
        powersets(s, i+1, ans+curr );
        powersets(s, i+1, ans );
    }
}