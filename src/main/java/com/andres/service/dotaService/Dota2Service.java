package com.andres.service.dotaService;



import com.andres.entity.dota2.Result;
import com.andres.entity.dota2.Results;
import com.andres.repository.dota2repository.dota2Repository;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.apache.tomcat.util.json.JSONParser;
import org.apache.tomcat.util.json.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.logging.Logger;

@Service
public class Dota2Service {

    private final String baseUrl = "http://api.steampowered.com/IDOTA2Match_570/GetMatchHistory/v1/?key=%s";
    private final String key = "F6A54A5F66DBBDDAF56560C18C25D52B";
    /*@Autowired
    public Results results;*/
    /*@Autowired
    public dota2Repository dota2Repository;*/


    @Autowired
    public WebClient.Builder builder;

    public JsonParser parser;

    public void readJson(){

        try {
            ObjectMapper mapper = new ObjectMapper();
            TypeReference<Result> typeReference = new TypeReference<Result>(){};
            InputStream inputStream = TypeReference.class.getResourceAsStream("C:/Users/andre/Desktop/dota2Json.json");
            Result results = mapper.readValue(inputStream,typeReference);
            /*JSONParser parser = new JSONParser(new FileReader("C:\\Users\\andre\\Desktop\\dota2Json.json"));
            Object obj = parser.parse();
            Result res = (Result) obj;*/
            System.out.println(results.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }/*catch (ParseException e){
            e.printStackTrace();
        }*/ catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void saveAllMatches(String accId){
        String finalUrl = String.format(baseUrl,key)+"&account_id="+accId;
       /* Flux<Result> res = WebClient.create()
                .get()
                .uri(finalUrl)
                .exchange()
                .*/
        Logger.getLogger("").info(finalUrl);
        }


        //return results.getResult().getMatches();
    }

