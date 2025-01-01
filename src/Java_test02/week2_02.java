package week2;

import java.util.Scanner;
import java.util.Arrays;

public class week2_02 {
    public static void main(String[] args) {
        //배열 생성
        Scanner sc = new Scanner(System.in);
        System.out.println("행 : ");
        int row = sc.nextInt();
        System.out.println("열 : ");
        int col = sc.nextInt();
        System.out.println(row + " " + col);

        //배열 출력
        int[][] arry = new int[row][col];
        System.out.println(Arrays.deepToString(arry));

        //배열 데이터 삽입
        System.out.println("2차원 배열의 값을 입력 하세요");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                int data = sc.nextInt();
                arry[i][j] = data;
            }
        }
        System.out.println(Arrays.deepToString(arry));

        // 행 열 값 입력을 통해 원하는 값 찾기
        System.out.println("찾고자 하는 값의 위치(행 열을 입력하세요)");

        System.out.println("행 : ");
        int find_row = sc.nextInt() - 1;
        System.out.println("열 : ");
        int find_col = sc.nextInt() - 1;

        System.out.println("찾고자 하는 행/열의 값은" + arry[find_row][find_col] + "입니다");
    }
}
