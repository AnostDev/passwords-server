package com.keygen.keygen.controller;

import com.keygen.keygen.model.Key;
import com.keygen.keygen.repository.KeyRepository;
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
    private KeyRepository kr;

    @GetMapping(path = "/generate")
    public @ResponseBody String addNewKey(@RequestParam int duration){

        Date creationDate = new Date();
        Date expirationDate = creationDate;
        expirationDate.setYear(expirationDate.getYear() +  duration);

        Key key = new Key();
        key.setCreationDate(creationDate);
        key.setExpireDate(expirationDate);
        return "Saved key: " + key.getId().toString();
    }




}
