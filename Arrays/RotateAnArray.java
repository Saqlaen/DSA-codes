public class RotateAnArray {

    public static void reverseFunc(int[] arr,int si,int ei){
        while(si<ei){
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }
    public static void rev(long[] arr,int si, int ei){
        while(si<ei){
            long temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] arg){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        int k = 3;
        // in this approach we are trying to reverse the array by breaking them 
        // into parts
        // suppose we have to rotate the array 3 times
        // 1 2 3 4  5 6 7   k = 3 we divide the array and reverse them with parts
        // 4 3 2 1  7 6 5   we reverse the whole  array that we didvided  
        // 5 6 7 1  2 3 4   we get the final result
        //as discussed we take 3 steps
        //n-1-k will give me the ending index of firsthalf
        //n-k will give me the starting index of second half 
        reverseFunc(arr, 0, n-1-k);
        reverseFunc(arr, n-k, n-1); 
        reverseFunc(arr, 0, n-1);
        printArray(arr);

        //we can also perform this using a formula approach 
        //(i+k)%n which will give me the index of the element after the array is rotated
        //this approach will take SC = O(n) TC = O(n)
        int[] rotatedArr = new int[n];
        for(int i=0;i<n;i++){
            rotatedArr[(i+k)%n] = arr[i];
        }

        //rotate the array by left 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        long[] arr =  new long[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
         int k = sc.nextInt();
        //1 2 | 3 4 5 6 7
        //2 1 | 7 6 5 4 3
        //3 4 5 6 7 1 2 
		// Write code here
        rev(arr,0,k-1);
        rev(arr,k,n-1);
        rev(arr,0,n-1);
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}
