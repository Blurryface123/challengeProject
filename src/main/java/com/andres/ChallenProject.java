package com.andres;

import com.andres.entity.dota2.Match;
import com.andres.entity.dota2.Result;
import com.andres.entity.dota2.Results;
import com.andres.service.dotaService.Dota2Service;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

import java.io.InputStream;


@SpringBootApplication
public class ChallenProject implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(ChallenProject.class, args);

    }

    @Autowired
    public Dota2Service dota2Service;

    @Override
    public void run(String... args) throws Exception {
       //dota2Service.saveAllMatches("1234");
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<Results> typeReference = new TypeReference<Results>(){};
        InputStream inputStream = TypeReference.class.getResourceAsStream("C:/Users/andre/Desktop/dota2Json.json");
        Results results = mapper.readValue(inputStream,typeReference);
        System.out.println(results.toString());
    }
}
