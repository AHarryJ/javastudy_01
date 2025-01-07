package week3;
import java.util.Scanner;
import java.util.Arrays;

// 오버라이드 vs 오버로드 실습 코드


//오버 로드 사용 코드 : 메소드의 이름은 같되 매개변수의 개수가 다름
public class LineCalculator {
    int add(int x,int y){return x+y;}
    int add(int x,int y,int z){return x+y+z;}
    int add(int x,int y,int z, int w){return x+y+z+w;}

    public static void main(String[] args) {
        System.out.println("수를 입력하세요(최대 4개까지)");
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String[] data = num.split(" ");
        System.out.println("data 총 개수 : "+ data.length);
        System.out.println(Arrays.toString(data));
        LineCalculator lc = new LineCalculator();

        if(data.length == 2){
            int x = Integer.parseInt(data[0]);
            int y = Integer.parseInt(data[1]);
            System.out.println("두변의 길이는 : " + lc.add(x,y));
        }
        else if(data.length == 3){
            int x = Integer.parseInt(data[0]);
            int y = Integer.parseInt(data[1]);
            int z = Integer.parseInt(data[2]);
            System.out.println("두변의 길이는 : " + lc.add(x,y,z));
        }
        else{
            int x = Integer.parseInt(data[0]);
            int y = Integer.parseInt(data[1]);
            int z = Integer.parseInt(data[2]);
            int w = Integer.parseInt(data[3]);
            System.out.println("두변의 길이는 : " + lc.add(x,y,z,w));
        }
    }
}
