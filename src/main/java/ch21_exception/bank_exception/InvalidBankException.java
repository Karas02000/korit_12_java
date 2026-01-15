package ch21_exception.bank_exception;

public class InvalidBankException extends RuntimeException {
    int balance = 10000;
    public InvalidBankException(String message) {
        super(message);
    }
}
