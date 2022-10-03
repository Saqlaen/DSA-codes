public class Adjacentstr {
    public static void main(String[] arg){
        String str = "aabyzz";
        String ans = recur(str);
        System.out.println(ans);
    }
    // public static String recur(String str){
    //     for(int i=0; i<str.length(); i++){
    //         if(str.charAt(i) == str.charAt(i+1)){
    //             String newStr = str.substring(0, i) + str.substring(i+2);
    //             return newStr;
    //         }
             
    //     }
    //     return str;
    // }
}
