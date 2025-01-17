import java.util.Arrays;
import java.util.Scanner;


public class week2_01 {
    static  int[] DB;
    static  int[] DB2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("배열 크기를 입력하세요");
        int n = sc.nextInt();
        DB = new int[n]; //배열 크기 선언

        //배열 값 입력
        System.out.println(n + "개의 값을 입력하세요");
        for(int i = 0; i < n;i++){ //값 입력
            Scanner num = new Scanner(System.in);
            int array_num = num.nextInt();
            DB[i] = array_num;
        }
        System.out.println(Arrays.toString(DB));

        //배열 복사(1)
        DB2 = new int[n];
        for(int i = 0; i < n; i++){
            DB2[i] = DB[i];
        }
        System.out.println("복사된 배열 DB2의 값은 "+ Arrays.toString(DB2));

        //배열 복사(2)
        System.out.println("배열 복사 두번째 방법 : ");
        System.arraycopy(DB, 0, DB2,0, DB.length);
        System.out.println(Arrays.toString(DB2));

        //DB 배열내 가장 큰 값, 작은값 출력
        int max = DB[0];
        int min = DB[0];
        for(int i = 0; i < n;i++){

            if(DB[i] > max){
                max = DB[i];
            }
            if(DB[i] < min){
                min = DB[i];
            }
        }
        System.out.println("==============");
        System.out.println("배열의 최대값은" + max+ "이다");
        System.out.println("배열의 최소값은" + min+ "이다");
    }
}
