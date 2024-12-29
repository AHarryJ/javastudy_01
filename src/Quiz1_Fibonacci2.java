import java.util.Scanner;

public class Quiz1_Fibonacci2 {
    static int[] memo;
    public static int fibonaccimemo(int n){
        if(n == 0){
            return 0;
        }
        else if(n==1){
            return 1;
        }else{
            if(memo[n] == 0){
                memo[n] = fibonaccimemo(n-1) + fibonaccimemo(n-2);
            }
            return memo[n];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        memo = new int[n+1];
        for(int i = 0; i < n; i++){
            System.out.print(fibonaccimemo(i)+" ");
        }
    }
}
