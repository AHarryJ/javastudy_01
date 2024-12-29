import java.util.Scanner;

public class Quiz1_Fibonacci {

    public static int recursive(int n){
        if(n == 0){
            return 0;
        }
        else if(n==1){
            return 1;
        }else{
            return recursive(n-1) + recursive(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print(recursive(i)+" ");
        }
    }
}
