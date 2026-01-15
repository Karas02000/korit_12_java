package ch21_exception.id_exception;

public class InvalidIdException extends RuntimeException {
    public InvalidIdException(String message) {
        super(message);
        System.out.println(message);
    }
}
