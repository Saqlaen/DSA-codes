package feature01.2 ptr and sliding window;

public class YashAndMaximumSum {
    
    /*Example 1: 6 3 2 3 7 5 6 4 Output: 18 Explanation: After ignoring two elements from the start and one element from the end, 
            the original array now becomes {7, 5, 6}. The remaining elements of the array have a sum equal to 18.
            Example 2: 8 4 6 4 2 2 9 9 3 3 Output: 24 Explanation: After ignoring four elements from the start, the original array now becomes {9, 9, 3, 3}. 
            The remaining elements of the array have a sum equal to 24.
            Constraints: 1 <= N <= 10^4 0 <= K <= N 0 <= arr[i] <=10^5 */
            public static void main (String[] args) throws java.lang.Exception
            {
                        Scanner sc = new Scanner(System.in);
                        int n  = sc.nextInt();
                        int k  = sc.nextInt();
                        int[] arr  = new int[n];
                        for(int i=0; i<n; i++){
                                arr[i] = sc.nextInt();
                        }
                        // 6  4  2  2  9  9  3  3
                        int start = 0, end = n-k -1 ;
                        int sum = 0;
                        for(int i=0; i<=end; i++){
                                sum += arr[i];
                        }
                        int maxSum = sum;
                        end++;
                        while(end < n){
                                sum += arr[end++];
                                sum -= arr[start++];
                                maxSum = Math.max( maxSum , sum);
                        }
                        System.out.println(maxSum);
            }
}
