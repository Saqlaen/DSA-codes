import java.util.*;
public class goodNo {
    public static void main(String[] arg ){
        /*
        Given two positive integers L, R and a digit D, find out all the good numbers in the range [L, R], which do not contain the digit D.
        A number is a good number if it's every digit is larger than the sum of digits which are on the right side of that digit. 
        9620  is good as (2 > 0, 6 > 2+0, 9 > 6+2+0)
        Input:
        L=200
        R=700
        D=4
        Output:
        {210, 310, 320, 510, 520, 521, 530, 531,
        610, 620, 621, 630, 631, 632, 650}
        Explanation:
        These are the only good numbers in the range
        [200,700]
        Example 2:
        Input:
        L=100
        R=500
        D=5
        Output:
        {210, 310, 320, 410, 420, 421, 430}
        Explanation:
        These are the only good numbers in the range
        [100,500]
         */
        int L = 100, R = 500, D = 5;
        ArrayList<Integer> ans = goodNumbers(L, R, D);
    }
    public static ArrayList<Integer> goodNumbers(int L, int R, int D) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=L; i<=R;i++){
            if(isValid(i,D)){
                list.add(i);
            }
        }
        return list;
    }
    public static boolean isValid(int num, int d){
        int temp = num;
        int sum = temp % 10;
        if(sum == d){
            return false;
        }
        temp /= 10;
        while(temp!=0){
           int rem = temp % 10;
           if(rem==d || rem<=sum )
                return false;
           sum += rem;
           temp /= 10;
        }
        return true;
    }
}
