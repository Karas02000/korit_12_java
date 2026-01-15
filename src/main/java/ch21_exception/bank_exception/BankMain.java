package ch21_exception.bank_exception;

public class BankMain {
    public static void checkBank (int money) throws InvalidBankException {
        if(money > 10000) {
            throw new InvalidBankException("잔액이 부족합니다. (부족 금액: " + (money-10000) +"원)");
        }
    }

    public static void main(String[] args) {

    }
}
