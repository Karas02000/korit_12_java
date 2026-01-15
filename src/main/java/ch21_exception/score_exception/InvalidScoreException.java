package ch21_exception.score_exception;

public class InvalidScoreException extends Exception {
    public InvalidScoreException(String message) {
        super(message);
        System.out.println(message);
    }
}
