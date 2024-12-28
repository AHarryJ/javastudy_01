import java.util.Scanner;
import java.util.Arrays;
public class java_study_02 {
    public static void main(String[] args) {
        int[] num = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            num[i] = sc.nextInt();
        }
        System.out.printf(Arrays.toString(num));
    }
}
