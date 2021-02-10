package com.CCstudent.whiskey_lab.controllers;

import com.CCstudent.whiskey_lab.models.Whiskey;
import com.CCstudent.whiskey_lab.repos.WhiskeyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class WhiskeyController {

    @Autowired
    WhiskeyRepository whiskeyRepository;

    @GetMapping(value = "/whiskeys")
    public ResponseEntity <List<Whiskey>> getAllWhiskeys(){
        return new ResponseEntity<>(whiskeyRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/whiskeys/{id}")
    public ResponseEntity <Optional<Whiskey>> getWhiskeyById(@PathVariable Long id){
        return new ResponseEntity <>(whiskeyRepository.findById(id), HttpStatus.OK);
    }



}
