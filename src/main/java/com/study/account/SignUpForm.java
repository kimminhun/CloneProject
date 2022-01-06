package com.study.account;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;


@Data
public class SignUpForm {


    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Length(min = 3, max = 20)
    private String nickname;

    @NotBlank
    @Length(min=8,max = 50)
    private String password;

}
