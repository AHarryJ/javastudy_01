package week3;

public class Student {
    //필드
    String name;
    int age;
    String studentnumber;
    double score;

    //생성자
    Student(String name, int age, String studentnumber,double score){
        this.name = name;
        this.age = age;
        this.studentnumber = studentnumber;
        this.score = score;
    }
    //메소드
    public void printf(){
        System.out.println("이름" + name + "나이"+ age +
                "학번" + studentnumber+"점수" + score);
    }

    public static void main(String[] args) {
        //생성자가 없는 경우
        Student student = new Student();
        //생성자가 있는 경우
        Student student2 = new Student("harry",25,"2020xxxxx", 3.82);
    }
}
