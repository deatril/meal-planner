package com.deatril.mealPlanner.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mealController {

    @GetMapping("/meal/{id}")
    public ResponseEntity<String> getMeal(@PathVariable String id) {
        return new ResponseEntity<>("id : " + id, HttpStatus.OK);
    }


}
