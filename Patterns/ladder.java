import java.util.*;
public class ladder {

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=n; i++) //for n we have to print n lines
        {
                for(int j=(n-i); j>0; j--){ // will give me the spaces required
                        System.out.print(" ");
                }
                for(int k=0;k<i;k++){ //only increment till i th value
                    System.out.print("#");  
                }
            System.out.println();
        }
    }
}
