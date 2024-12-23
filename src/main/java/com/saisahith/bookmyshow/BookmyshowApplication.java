package com.saisahith.bookmyshow;

import models.BaseModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookmyshowApplication {

    public static void main(String[] args) {
        BaseModel baseModel = new BaseModel();
//
        SpringApplication.run(BookmyshowApplication.class, args);
    }

}
