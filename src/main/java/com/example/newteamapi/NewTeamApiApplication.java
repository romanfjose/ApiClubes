package com.example.newteamapi;

import com.example.newteamapi.model.Team;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class NewTeamApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(NewTeamApiApplication.class, args);
    }
}
