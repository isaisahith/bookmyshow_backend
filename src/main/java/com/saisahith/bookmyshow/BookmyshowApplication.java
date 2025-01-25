package com.saisahith.bookmyshow;

import com.saisahith.bookmyshow.controllers.TheatreController;
import com.saisahith.bookmyshow.controllers.UserController;
import com.saisahith.bookmyshow.dto.CreateTheatreRequestDto;
import com.saisahith.bookmyshow.dto.CreateTheatreResponseDto;
import com.saisahith.bookmyshow.dto.SignUpRequestDto;
import com.saisahith.bookmyshow.dto.SignUpResponseDto;
import com.saisahith.bookmyshow.models.BaseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com/saisahith/bookmyshow/models")
public class BookmyshowApplication implements CommandLineRunner {

    @Autowired
    public UserController userController;
    @Autowired
    public TheatreController theatreController;

    public static void main(String[] args) {
        BaseModel baseModel = new BaseModel();
//
        SpringApplication.run(BookmyshowApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        SignUpRequestDto signUpRequestDto = new SignUpRequestDto();
//
//        signUpRequestDto.setEmail("Sahith@gmail.com");
//        signUpRequestDto.setPassword("123456");
//
//        SignUpResponseDto responseDto = userController.signUp(signUpRequestDto);
//        System.out.println(responseDto.getMessage());

        CreateTheatreRequestDto theatreRequestDto = new CreateTheatreRequestDto();
        theatreRequestDto.setRegion("Kovur");
        theatreRequestDto.setAddress("Kovur, Main Road, Mandhabayata");
        theatreRequestDto.setName("Srinivasa");

        CreateTheatreResponseDto response = theatreController.craeteTheatre(theatreRequestDto);
        System.out.println(response.getMessage());

    }
}
