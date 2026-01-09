package ch16_been;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

/*
    정보를 담는 객체를 Entity Class 라고 합니다.
    -> 데이터베이스와 연결되는 클래스만 지칭하기 때문에 특별한 지위에 있다고 할 수 있다.
 */
@Getter
@Setter
public class UserEntity {
    Scanner sc = new Scanner(System.in);
    private int username;
    private int password;
    private String email;
    private String name;

    public UserEntity() {}

    @Override
    public String toString() {

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        return "username \\ " +  this.username
                + "\npassword \\ " +  this.password
                + "\nemail \\ " +  this.email
                + "\nname \\ " +  this.name;
    }
}
