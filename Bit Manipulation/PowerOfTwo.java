public class PowerOfTwo {
    public static void main(String[] arg){
        /*Given a number n, check whether it is a power of two or not.
        An integer n is a power of two, if there exists an integer x such that n = 2^x
        Example:
        2, 4, 8, 16 are powers of 2, while 3, 5, 6, 7 are not. */
        int n = 5, temp = n;
        boolean ans = false;
        if(n <= 0)
            ans = false;
        while( temp % 2 == 0){
            temp /=2;
        }
        boolean result = (temp==1);


    }
    public static void bitManip(int n){
        /*
         * Method 3: Bit operation
            If n is the power of two:
            n = 2 ^ 0 = 1 = 0b0000...00000001, and (n - 1) = 0 = 0b0000...0000.
            n = 2 ^ 1 = 2 = 0b0000...00000010, and (n - 1) = 1 = 0b0000...0001.
            n = 2 ^ 2 = 4 = 0b0000...00000100, and (n - 1) = 3 = 0b0000...0011.
            n = 2 ^ 3 = 8 = 0b0000...00001000, and (n - 1) = 7 = 0b0000...0111.
            we have n & (n-1) == 0b0000...0000 == 0
            Otherwise, n & (n-1) != 0.
            For example, n =14 = 0b0000...1110, and (n - 1) = 13 = 0b0000...1101.
            return n > 0 && ((n & (n-1)) == 0);
         */
            if(n <= 0)
                System.out.print("false");
            if( (n & (n-1)) == 0 ){
                System.out.print("true");
            }
            else{
                System.out.print("false");
            }
    }
    
}
