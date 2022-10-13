public class ReverseArray{
    public static void main(String[] arg){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        reverse(arr,n);
    }
    //TC for this approach would be O(logn)
    public static void reverse(int[] arr,int n){
        //n-1-i will give me the last position index 
        // to swap with first index and so on
        for(int i=0;i<n/2;i++){
            int firstIndx = i;
            int secondIndx = n-1-i;
            int temp = arr[firstIndx];
            arr[firstIndx] = arr[secondIndx];
            arr[secondIndx] = temp;
        }

        for(int j=0;j<n;j++){
            System.out.print(arr[j]+" ");
        }


    }
}