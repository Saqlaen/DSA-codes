import java.util.*;
public class MaxLenSubArrSum
{
	public static void main(String[] args) {
	     //longest subarray with sum = k (to find length) 
	     int[] arr = {10, 5, 2, 7, 1, 9};
	     int k = 15;
	     hashing( arr, k, arr.length);
	     bruteforce( arr, k, arr.length);
	}
	public static void bruteforce(int[] arr, int k, int n){
	     int len = 0;
	     for(int i=0; i<n; i++){
	          int sum = 0;
	          for(int j=i; j<n; j++){
	               sum += arr[j];
	               if(sum == k){
	                    len = Math.max(len, j-i+1);
	               }
	          }
	     }
	     System.out.print(len);
	}
	public static void hashing(int[] arr, int k, int n){
	    // 10, 5,   2,   7, 1,   9
	    // 10, 15, 17,  24, 25, 34
	    HashMap<Integer,Integer> hm = new HashMap<>();
	     int ans = 0;
	     int sum = 0;
	     for( int i=0; i<n; i++){
	          sum += arr[i];
	          if(sum == k){
	               ans = i+1;
	          }
	          if( hm.containsKey(sum-k)){
	               ans = Math.max(ans, i - hm.get(sum-k) );
	          }
	          else{
	               hm.put(sum,i);
	          }
	     }
	     System.out.println(ans);
	}
	
	
}
