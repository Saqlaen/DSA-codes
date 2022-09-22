import java.util.*;
public class PowerSets {
    public static void main(String[] arg){
        String s = "abc";
        powersets(s, 0, "");

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> subset = new ArrayList<>();
        ArrayList<Integer> str = new ArrayList<>();
        str.add(1);
        str.add(2);
        str.add(3);
        usingArrList(str, ans, subset, 0);
        for(ArrayList<Integer> a: ans){
            System.out.println(a);
        }

    }
    public static void powersets(String s,int i, String ans){
        //time complexity O(2^n)
        //space complexity O(n)
        if(i == s.length()){
            System.out.println(ans);
            return;
        }
        char curr = s.charAt(i);
        powersets(s, i+1, ans+curr );
        powersets(s, i+1, ans );
    }
    public static void usingArrList( ArrayList<Integer> str ,ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> subset, int i ){
        if( i == str.size()){
            ans.add(new ArrayList<>(subset) );
            return;
        }
        //pick the element to come 
        subset.add( str.get(i));
        usingArrList( str, ans, subset, i+1 );
        // removing the element
        subset.remove( subset.size()-1 );
        usingArrList( str, ans, subset, i+1 );

    }
}