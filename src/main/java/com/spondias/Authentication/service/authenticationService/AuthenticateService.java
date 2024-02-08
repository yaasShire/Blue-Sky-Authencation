package com.spondias.Authentication.service.authenticationService;


import com.spondias.Authentication.exception.authenticationException.AuthenticationException;
import com.spondias.Authentication.model.authenticationModel.*;

public interface AuthenticateService {
    public OTPResponseModel signUpUser(SignUpRequestModel body) throws AuthenticationException;

    SignUpResponseModel verifyOTP(OTP otp) throws AuthenticationException;

    SignInResponseModel signIn(SignInRequestModel body) throws AuthenticationException;

    OTPResponseModel sendForgetPasswordOTP(RequestForgetPasswordOTP phoneNumber) throws AuthenticationException;

    ForgetPasswordResponse updatePassword(ChangePasswordCredentials changePasswordCredentials) throws AuthenticationException;

    OTPResponseModel verifyForgetPasswordOTP(OTP otp) throws AuthenticationException;
}
