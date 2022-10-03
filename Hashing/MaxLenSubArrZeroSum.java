import java.util.*;
public class MaxLenSubArrZeroSum
{
	public static void main(String[] args) {
	     //longest subarray with sum = 0 (to find length) 
        /*
          * Given an array having both positive and negative integers. 
        The task is to compute the length of the largest subarray with sum 0.
            Example 1:
            Input:
            N = 8
            A[] = {15,-2,2,-8,1,7,10,23}
            Output: 5
            Explanation: The largest subarray with
            sum 0 will be -2 2 -8 1 7.
          */
	    int[] arr = {15,-2,2,-8,1,7,10,23};
	    hashing( arr,  arr.length);
	    bruteforce( arr,  arr.length);
	}
	public static void bruteforce(int[] arr,  int n){
	    int len = 0;
	    for(int i=0; i<n; i++){
	        int sum = 0;
	        for(int j=i; j<n; j++){
	            sum += arr[j];
	            if(sum == 0){
	                    len = Math.max(len, j-i+1);
	            }
	        }
	    }
	    System.out.print(len);
	}
	public static void hashing(int[] arr,  int n){
	    HashMap<Integer,Integer> hm =  new HashMap<>();
        int ans  = 0;
        int sum = 0;
        // 15,-2, 2, -8 ,1, 7, 10 ,23
        // 15 13  15  7  8  15 25  48
        for(int i=0; i<n; i++){
            sum += arr[i];
            if(sum == 0){
                ans = i+1;
            }
            if(hm.containsKey(sum)){
                ans = Math.max( ans, (i - hm.get(sum)) ) ;
            }
            else{
                hm.put(sum,i);
            }
        }
	    System.out.println(ans);
	}
	
}

