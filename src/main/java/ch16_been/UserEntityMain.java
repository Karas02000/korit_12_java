package ch16_been;

public class UserEntityMain {
    public static void main(String[] args) {
        UserEntity user1 = new UserEntity();
        user1.setUsername(1);
        user1.setPassword(1234);
        user1.setEmail("jackpot777@abc.com");
        user1.setName("Jack");

        System.out.println(user1.toString());
    }
}
