package week3;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

//숫자 야구 프로젝트
public class BaseBall {
    static int[] computer;
    static int[] user;
    static String[] user_data;

    static boolean[] count;

    public static void main(String[] args) {
        computer = new int[3];
        user = new int[3];

        System.out.println("숫자 3개를 입력하세요(0~9)");
        Scanner sc = new Scanner(System.in);
        String user_input = sc.nextLine();

        user_data = new String[3];
        user_data = user_input.split(" ");

        Random random = new Random();

        for(int i = 0; i < 3; i++){
            user[i] = Integer.parseInt(user_data[i]);
        }

        for(int j = 0; j < 3; j++){
            computer[j] = random.nextInt(10);
        }

        System.out.println("입력자의 입력 값 : " + Arrays.toString(user));
        System.out.println("컴퓨터의 랜덤 값 : " + Arrays.toString(computer));

        count = new boolean[3];

        for(int i = 0; i < 3; i++){
            if(user[i] == computer[i]){
                count[i] = true;
            }
            else{count[i] = false;}
        }

        System.out.println("스트라이크&볼 배열 : " + Arrays.toString(count));

        int strike = 0;
        int ball = 0;
        //True일 떄 스트라이크. false일 때 볼 판단
        for(int i = 0; i < 3; i++){
            if(count[i] == true){
                strike++;
            }
            else{ball++;}
        }
        System.out.println("스트라이크 : "+strike + " 볼 : "+ball);

    }
}

