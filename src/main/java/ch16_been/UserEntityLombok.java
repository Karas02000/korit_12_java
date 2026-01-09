package ch16_been;


import lombok.*;

@ToString
@AllArgsConstructor
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
public class UserEntityLombok {
    private int username;
    @Setter
    private int password;
    @NonNull
    private String name;
    private String email;

}
