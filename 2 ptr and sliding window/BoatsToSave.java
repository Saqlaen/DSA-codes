
public class BoatsToSave {
    public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int n  = sc.nextInt();
                int target = sc.nextInt();
                int[] arr  = new int[n];
                for(int i=0; i<n; i++){
                        arr[i] = sc.nextInt();
                }
                int start  = 0,  end = n-1 , min = 0;
                // 3 5 3 4 
                // 3 3 4 5  t->5
                Arrays.sort(arr);
                //if the heaviest person can share a boat with lighest person
                while( start <= end){
                        min++;
                        if(arr[start] + arr[end] <= target){
                                start++;
                        }
                        end--;

                }
                System.out.print(min);
	}    
}
