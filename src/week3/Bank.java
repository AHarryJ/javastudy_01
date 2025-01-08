package week3;
import java.util.Scanner;


public class Bank {
    String accountNumber; //계좌번호
    int balance; //계좌 잔액
    String accountHolder; //계좌 소유자

    Bank(String accountNumber,String accountHolder, int balance){ // 생성자
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public int deposit(int amount){
        // 저축
        balance += amount;
        return balance;
    }
    public int withdraw(int amount){
        // 출금
        balance -= amount;
        return balance;
    }

    public int getBalance() {
        //계좌 잔액 반환
        return balance;
    }
}
class SavingsAccount extends Bank{ //저축 - 이자 추가

    SavingsAccount(String accountNumber,String accountHolder, int balance){
        super(accountNumber,accountHolder,balance);
    }
    final double INTEREST_RATE = 0.03; //이자율
    double addinterest = 0;
    public double Interest(){
        // 이자 계산
        addinterest = balance * INTEREST_RATE;

        return addinterest;
    }

    public int getBalance(){
        addinterest = balance + (balance * INTEREST_RATE);
        return (int)Math.round(addinterest);
    }
}

class Main{
    public static void main(String[] args) {
        Bank bank = new Bank("1111111111", "harry", 400);

        System.out.println("입금할 돈을 입력하세요");
        Scanner sc= new Scanner(System.in);
        int deposit = sc.nextInt();

        System.out.println("계좌내 금액은 : " + bank.deposit(deposit));

        System.out.println("출금할 돈을 입력하세요");
        int withdraw = sc.nextInt();

        System.out.println("출금 이후 계좌내 금액은 : " + bank.deposit(withdraw));

        System.out.println("계좌내 잔액 : " + bank.getBalance());

        System.out.println("================================================");

        SavingsAccount savingsAccount = new SavingsAccount("222222", "An", 500);
        System.out.println("입금할 돈을 입력하세요");
        int deposit2 = sc.nextInt();
        System.out.println("계좌내 금액은 : " + savingsAccount.deposit(deposit2));

        System.out.println("출금할 돈을 입력하세요");
        int withdraw2 = sc.nextInt();

        System.out.println("계좌내 금액은 : " + savingsAccount.deposit(withdraw2));

        System.out.println("이자 + 원금 : " + savingsAccount.getBalance());
        System.out.println("이자 : "+savingsAccount.Interest());

    }
}
