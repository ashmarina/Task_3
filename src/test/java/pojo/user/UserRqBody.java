package pojo.user;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor(force = true)
@Getter
@Setter
@Builder(toBuilder = true)
@ToString
public class UserRqBody {
    private String email;
    private String password;
    private String name;
}
