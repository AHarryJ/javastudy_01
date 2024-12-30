public class Quiz1_fibonacci3 {

    public static int fibonacciloop(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            int fibpre= 0;
            int fibpro = 1;
            for(int i = 2; i <= n; i++){
                int temp = fibpro;
                fibpro = fibpre + fibpro;
                fibpre = temp;
            }
            return fibpro;
        }
    }

    public static void main(String[] args) {
        int n = 10;
        for(int i = 0; i<n;i++){
            System.out.print(fibonacciloop(i) + " ");
        }
    }
}
