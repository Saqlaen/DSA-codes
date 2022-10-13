public class gcdOfTwoNo {
    public static void main(String[] arg){
        //36 = 2*2*3*3
        //60 = 2*2*3*5
        //GCD = Multiplication of common factors 
        //2*2*3 = 12
        //we have to find the gcd of two factorial number
        // trick to finding out the factorial
        //integer limit is 10^9
        int a = 4;
        int b = 3;
        int ans = 1;
        for(int i=2; i<=Math.min(a,b); i++){
            ans = ans*i;
        }
        System.out.println(ans);
        //GCD of two factorial is the factorial of the Math.min(a,b)

        //GDC using euclidean algo 
        // gcd(a,b) = gcd( b ,a % b )
        // gcd(a,0) = a
        //example
        //gcd(10,14) = gcd( 14 , 10 % 14)      14|10|0
        //gcd(14,10) = gcd( 10 , 14 % 10)      10|14
        //gcd(10,4)  = gcd( 4 ,  10 % 4)
        //gcd(4,2)   = gcd( 2 , 4 % 2)
        //gcd(2,0)   = 2
        //Time Complexity 
        // O(log(min(a,b)))



    }
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd( b , a%b );
    }
    
}
