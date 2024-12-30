package com.saisahith.bookmyshow.services;

import com.saisahith.bookmyshow.models.User;
import com.saisahith.bookmyshow.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServices {
    @Autowired
    UserRepository userRepository;

    public User signUp(String email, String password){

        Optional<User> userOptional = userRepository.findByemail(email);

        if(userOptional.isPresent()){
            throw new RuntimeException("User already exists");
        }

        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        return userRepository.save(user);


    }
}
