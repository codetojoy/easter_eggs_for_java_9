package com.allstate.jigsaw;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModuleController {

    @RequestMapping("/java9")
    public HttpEntity<String> greeting(
            @RequestParam(value = "name", required = false, defaultValue = "World") String name) {


        return new ResponseEntity<String>("Welcome to Java 9!", HttpStatus.OK);
    }
}
