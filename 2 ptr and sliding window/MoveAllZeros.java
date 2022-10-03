
public class MoveAllZeros {
    public static void swap(int i, int j, int[] arr){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    public static void main(String[] args) {
        //move all the zeros to the end 
        int[] arr = {1,1,2,0,5,0,0,0,4,7};
        int n = arr.length;
        int j = 0;
        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                swap( i, j, arr);
                j++;
            }
        }
        for( int i: arr){
            System.out.print(i +" ");  
        }
        
    }    
}
