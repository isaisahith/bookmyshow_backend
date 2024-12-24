package com.saisahith.bookmyshow;

import com.saisahith.bookmyshow.models.BaseModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com/saisahith/bookmyshow/models")
public class BookmyshowApplication {

    public static void main(String[] args) {
        BaseModel baseModel = new BaseModel();
//
        SpringApplication.run(BookmyshowApplication.class, args);
    }

}
