public class groupAnagram {
    public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
        /*
         * Group Anagrams
            Given an array of strings strs, group the anagrams together. You can return the answer in any order.
            An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
            Input Format:
            Input consists of 2 lines.
            1st line contains the number of elements followed by n Strings.
            Output Format:
            Print the anagrams in different lines.
            EXAMPLE 1:
            Input:
            6
            eat tea tan ate nat bat
            Output::
            bat
            nat tan
            ate eat tea
         */
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                String[] starr = new String[n];
                for(int i=0; i<n; i++){
                        starr[i] = sc.next();
                }
                hashing(starr,n);
	}
        public static void hashing(String[] starr,int n){

                HashMap< String, List<String> > hm = new HashMap<>();
                for(String str : starr){
                        char[] arr = str.toCharArray();
                        Arrays.sort(arr);
                        String s = new String(arr);
                        if(hm.containsKey(s)){
                            hm.get(s).add(str);  
                        }
                        else{
                                List<String> li = new ArrayList<>();
                                li.add(str);
                                hm.put(s,li);
                        }
                }
                // Collection.sort(ans);
                for( List<String> li: hm.values()){
                        // Collections.sort(li);
                        for(String x : li){
                                System.out.print(x+" ");
                        }
                        System.out.println();
                }
        }
}
