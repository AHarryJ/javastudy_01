package week3;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class BB {
    static final int NUMBER_COUNT = 3; // 숫자의 개수
    static final int MAX_NUMBER = 10;   // 최대 숫자 범위
    static int[] computer;
    static int[] user;

    public static void main(String[] args) {
        computer = generateRandomNumbers();
        user = getUserInput();

        System.out.println("입력자의 입력 값 : " + Arrays.toString(user));
        System.out.println("컴퓨터의 랜덤 값 : " + Arrays.toString(computer));

        int[] result = calculateStrikeAndBall(user, computer);
        System.out.println("스트라이크 : " + result[0] + " 볼 : " + result[1]);
    }

    // 랜덤 숫자 생성
    private static int[] generateRandomNumbers() {
        Random random = new Random();
        int[] numbers = new int[NUMBER_COUNT];
        for (int i = 0; i < NUMBER_COUNT; i++) {
            numbers[i] = random.nextInt(MAX_NUMBER);
        }
        return numbers;
    }

    // 사용자 입력 받기
    private static int[] getUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 3개를 입력하세요(0~9):");
        String user_input = sc.nextLine();
        String[] user_data = user_input.split(" ");

        int[] userNumbers = new int[NUMBER_COUNT];
        for (int i = 0; i < NUMBER_COUNT; i++) {
            userNumbers[i] = Integer.parseInt(user_data[i]);
        }
        return userNumbers;
    }

    // 스트라이크와 볼 계산
    private static int[] calculateStrikeAndBall(int[] user, int[] computer) {
        int strike = 0;
        int ball = 0;

        for (int i = 0; i < NUMBER_COUNT; i++) {
            if (user[i] == computer[i]) {
                strike++;
            } else if (contains(computer, user[i])) {
                ball++;
            }
        }
        return new int[]{strike, ball};
    }

    // 배열에 특정 숫자가 포함되어 있는지 확인
    private static boolean contains(int[] array, int value) {
        for (int num : array) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }
}
