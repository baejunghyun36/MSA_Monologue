package com.example.userservice.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Greeting {

    //yml 파일에 있는 정보를 들고 올거야.
    @Value("${greeting.message}")
    private String message;


}
