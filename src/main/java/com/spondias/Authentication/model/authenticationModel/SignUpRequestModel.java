package com.spondias.Authentication.model.authenticationModel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class SignUpRequestModel {
    private String fullName;
    private String phoneNumber;
    private String email;
    private String password;
}
