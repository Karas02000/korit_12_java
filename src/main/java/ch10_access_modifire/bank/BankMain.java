package ch10_access_modifire.bank;

public class BankMain {
    public static void main(String[] args) {
        Bank account1 = new Bank(123456, "홍길동", 100000, "1234");
        Bank account2 = new Bank(987654, "심사임당", 500000, "9876");

        account1.showAccountInfo();
        System.out.println("--------------------------------------------");
        account2.showAccountInfo();
        System.out.println("--------------------------------------------");
        account1.desposit(5000, "1234");
        account1.withdraw(200000, "1234");
        account1.withdraw(100000,"1234");
        System.out.println("--------------------------------------------");
        account2.withdraw(100000, "9876");
        account2.desposit(200000, "9876");
        System.out.println("--------------------------------------------");
        account1.showAccountInfo();
        System.out.println("--------------------------------------------");
        account2.showAccountInfo();
    }
}
