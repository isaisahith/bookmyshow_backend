package com.saisahith.bookmyshow.controllers;

import com.saisahith.bookmyshow.dto.ResponseStatus;
import com.saisahith.bookmyshow.dto.SignUpRequestDto;
import com.saisahith.bookmyshow.dto.SignUpResponseDto;
import com.saisahith.bookmyshow.models.User;
import com.saisahith.bookmyshow.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    UserServices userService;

    public SignUpResponseDto signUp(SignUpRequestDto signUpRequestDto) {
        SignUpResponseDto signUpDto = new SignUpResponseDto();

        try{
            User user = userService.signUp
                    (signUpRequestDto.getEmail(),
                            signUpRequestDto.getPassword());

            signUpDto.setUserId(user.getEmail());
            signUpDto.setStatus(ResponseStatus.SUCCESS);
            signUpDto.setMessage("Sign up successful");


        }catch (Exception e){
            signUpDto.setStatus(ResponseStatus.FAILURE);
            signUpDto.setMessage(e.getMessage());

        }


        return signUpDto;
    }
}
