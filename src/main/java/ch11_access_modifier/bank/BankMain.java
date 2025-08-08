package ch11_access_modifier.bank;

public class BankMain {
    public static void main(String[] args) {
        Bank account1 = new Bank(123456, "홍길동", 100000, 1234);

            account1.deposit(50000, 12345);
            account1.deposit(50000, 1234);
            account1.withdraw(200000, 1234);
            account1.withdraw(100000, 1234);

        Bank account2 = new Bank(987654, "신사임당", 500000, 5678);

            account2.deposit(200000, 5678);
            account2.withdraw(100000,5678);


        account1.showAccountInfo();
        account2.showAccountInfo();

        // 잔액이 마이너스인 계좌 객체를 생성하는 방법
        Bank bank4 = new Bank(13579, "김사", -3000, 789456);
        bank4.showAccountInfo();
    }
}
