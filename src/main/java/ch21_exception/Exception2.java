package ch21_exception;

class LoginFailException extends Exception {
    public LoginFailException(String message) {
        super(message);
        System.out.println("로그인시 예외가 발생하였습니다.");
    }
}

/*
    Exception(String message) {
        this.message = message;
    }
 */

public class Exception2 {
    public static void login(String id, String password) throws LoginFailException {
        String corrctId = "admin";
        String corrctPassword = "1q2w3e4r!";

        if(!id.equals(corrctId) || !password.equals(corrctPassword)) {
            throw new LoginFailException("ID 또는 PW가 틀렸습니다.");
        }
    }
    public static void main(String[] args) throws LoginFailException {
        String inputId = "admin";
        String inputPassword = "1q2w3e4r!";
        try{
            login("user", "abcd");
        } catch(LoginFailException e) {
            System.out.println("로그인 실패 : " + e.getMessage());
        } finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}
