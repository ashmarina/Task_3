package pojo.user;

import lombok.Getter;


@Getter
public class UserRsBody {
    private Boolean success;
    private String message;
    private String accessToken;
    private String refreshToken;
    private User user;

    @Getter
    public static class User {
        private String email;
        private String name;
    }
}
