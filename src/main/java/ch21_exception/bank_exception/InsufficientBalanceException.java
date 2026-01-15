package ch21_exception.bank_exception;

public class InsufficientBalanceException extends RuntimeException {
    int balance = 10000;
    public InsufficientBalanceException(String message) {
        super(message);
        System.out.println(message);
    }
}
