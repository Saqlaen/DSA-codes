public class MaxOnesAfterMod {
    public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int n  = sc.nextInt();
                int[] arr  = new int[n];
                for(int i=0; i<n; i++){
                        arr[i] = sc.nextInt();
                }
                int k = sc.nextInt();
                int start = 0;
                int end = 0;
                int zeroCount = 0;
                int len  = 0;
                while(end < n){
                        if(arr[end]==0){
                                zeroCount++;
                        }
                        while(zeroCount > k){
                             if(arr[start]==0){
                                     zeroCount--;
                             }
                                start++;
                        }
                        //take len of subarrays
                        len = Math.max(len, end - start+1);
                        end++;
                }
                System.out.print(len);
	}
}
