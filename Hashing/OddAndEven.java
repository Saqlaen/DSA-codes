import java.util.*;
public class OddAndEven {
	public static void main(String[] args) {
    /*Sample Input 1:
            5
            4 5 1 2 1

            4
            2 1 2 1 

            Sample Output 1:
            3 1

            0 2
            Explanation For Sample 1:
            In the first test case, three integers(4, 5 and 2) occur odd times and the only integer 1 occurs even times.
            In the second test case, no integer occurs odd times and two integers(1 and 2) occurs even times.
            Sample Input 2:
            8
            5 2 9 9 7 5 1 3
            Sample Output 2:
            4 2 */
            int[] arr = {5,2,9,9,7,5,1,3};
            int[] res = hashing(arr, arr.length);
            for(int i : res){
                System.out.print(i+" ");
            }

    }
    public static int[] hashing(int[] arr, int n){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i<n; i++){
            hm.put( arr[i], hm.getOrDefault( arr[i], 0) + 1);
        }
        int odd = 0, even = 0;
        for(int x : hm.values()){
            if(x % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        int[] a = new int[2];
        a[0] = odd;
        a[1] = even;
        return a;
    }
}
