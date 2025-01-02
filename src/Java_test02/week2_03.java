package week2;

import java.util.Scanner;
import java.util.Arrays;

public class week2_03 {
    static String[][]reggedArray;

    public static void message(){ //저장 타입 메세지 출력
        System.out.println("원하는 저장형태를 입력하세요");
        System.out.println("1. 이름 전화번호 주민등록 번호");
        System.out.println("2. 이름 전화번호");
        System.out.println("3 이름");
    }

    public static void option1(String[] save){
        // 1번 선택 : 이름, 전화번호, 주민번호 입력
        Scanner data = new Scanner(System.in);

        System.out.println("이름 전화번호 주민번홀흘 입력하세요");
        String inputdata = data.nextLine();
        save = inputdata.split(" ");



    }

    public static  void option2(){
        //2번 선택 : 이름, 전화번호 입력
    }



    public static void main(String[] args) {
        //래그드 배열 활용
        message();
        int size = 0;
        System.out.println("원하는 저장 타입을 입력하세요");
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();

        reggedArray = new String[5][];

        for(int i = 0; i < 5; i++){
            System.out.println(i +"번째 정보를 입력하세요");
            if(answer == 1){
                reggedArray[i] = new String[3];
                option1(reggedArray[i]);
            }
            else if(answer == 2){
                option2();
            }
            else{

            }
        }

        System.out.println(Arrays.deepToString(reggedArray));
    }
}
