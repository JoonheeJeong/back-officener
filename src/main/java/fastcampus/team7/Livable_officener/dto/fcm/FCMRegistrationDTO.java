package fastcampus.team7.Livable_officener.dto.fcm;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FCMRegistrationDTO {

    private String email;
    private String fcmToken;
}
