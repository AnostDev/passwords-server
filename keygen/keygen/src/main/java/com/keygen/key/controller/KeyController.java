package com.keygen.key.controller;
import com.keygen.key.model.Key;
import com.keygen.key.service.KeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.UUID;

@Controller
public class KeyController {

    @Autowired
    private KeyService keyService;

    /*
    @RequestMapping(value = "/generate",
        method = RequestMethod.POST,
        consumes = {"application/json"},
        produces = {"application/json"})
    public @ResponseBody String addNewKey(@RequestParam int duration){

        Date creationDate = new Date();
        Date expirationDate = creationDate;
        expirationDate.setYear(expirationDate.getYear() +  duration);
        Key key = new Key().setCreationDate(creationDate).setExpirationDate(expirationDate);
        key = keyService.createKey(key);

        return "Saved key: " + key.toString();
    }
    */

    @RequestMapping(value = "/generate",
            method = RequestMethod.POST,
            consumes = {"application/json"},
            produces = {"application/json"})
    public @ResponseBody String addNewKey(@RequestBody Key key){

        Date creationDate = new Date();
        Date expirationDate = creationDate;
        expirationDate.setYear(expirationDate.getYear() +  key.getDurationn());
        key.setCreationDate(creationDate).setExpirationDate(expirationDate);
        key = keyService.createKey(key);

        return "Saved key: " + key.toString();
    }


    /*
    @GetMapping(path = "/authenticate")
    public @ResponseBody boolean authenticate(@RequestParam String password){
        //Key key = this.keyService
    }
    */

}
