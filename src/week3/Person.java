package week3;

//상속 예제 코드 작성

public class Person {
    //부모 필드
    String name;
    int age;

    //메소드
    public void print() {
        System.out.println("이름" + name);
        System.out.println("나이" + age);
    }

}
class Workers extends Person{
    //자식 필드
    String job;
    int start_year;

    //생성자
    Workers(String name, int age, String job, int start_year){
        this.name = name;
        this.age = age;
        this.job = job;
        this.start_year = start_year;
    }

    //자식 메소드
    public void print_job(){
        System.out.println("이름" + name + "나이 : "+ age +"직업 : "+ job);
    }

    public static void main(String[] args) {
        Workers worker = new Workers("harry", 28, "hacker", 2026);
        worker.print_job();
        worker.print();
    }
}



