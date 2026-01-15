package ch21_exception.store;

public class InvalidOrderQuantityException extends RuntimeException {
    public InvalidOrderQuantityException(String message) {
        super(message);
        System.out.println(message);
    }
}
