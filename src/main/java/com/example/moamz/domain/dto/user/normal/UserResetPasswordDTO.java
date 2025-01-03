package com.example.moamz.domain.dto.user.normal;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class UserResetPasswordDTO {
    private Long fgUserCode;
    private String fgUserId;
    private String fgUserPassword;
    private String fgNormalPhone;
}
