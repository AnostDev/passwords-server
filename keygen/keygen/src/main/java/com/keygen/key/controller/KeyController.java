package com.keygen.key.controller;
import com.keygen.key.model.Key;
import com.keygen.key.service.KeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.UUID;

@Controller
public class KeyController {

    @Autowired
    private KeyService keyService;

    @GetMapping(path = "/generate")
    public @ResponseBody String addNewKey(@RequestParam int duration){

        Date creationDate = new Date();
        Date expirationDate = creationDate;
        expirationDate.setYear(expirationDate.getYear() +  duration);

        Key key = new Key();
        key.setCreationDate(creationDate);
        key.setExpireDate(expirationDate);


        keyService.createKey(key);
        return "Saved key: " + key.getId().toString();
    }


    /*
    @GetMapping(path = "/authenticate")
    public @ResponseBody boolean authenticate(@RequestParam String password){
        //Key key = this.keyService
    }
    */

}
