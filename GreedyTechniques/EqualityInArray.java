public class EqualityInArray {
    public static void main(String[] arg){
        //suppose we have 3 1 2 2 3 3 4
        //if we have to keep 1 we need to delete 6 elements(1->6)
        //similary (2->5),(3->4),(4->6)
        //find the minimum no of elements to delete to make the array equal 
        //if we keep 3 compared to others we'll have to delete less no of elements
        //we take the frequency of the elements
        // ( N - MaximumNoFreq ) will give me the minimum no of elements to delete to make the array equal 
        int[] arr = {3,3,2,1,3};
        int maximum = 0;
        //finding the largest no in the array 
        for(int k=0; k < arr.length; k++){
            if(maximum < arr[k]){
                maximum = arr[k];
            }
        }
        int[] freq = new int[101];
        int max_freq = 0;
        //taking the frequency of the elements
        //we'll take the maximum frequency of the elements
        for(int i=0; i < arr.length; i++){
            freq[ arr[i] ]++;
            max_freq = Math.max(max_freq, freq[ arr[i] ]);
        }

        int output = arr.length - max_freq;
        System.out.println(output);
    }
}
