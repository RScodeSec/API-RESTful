package com.rs.apiv2.controllers;

import com.rs.apiv2.models.Language;

import com.rs.apiv2.services.LenguageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controllers {
    private LenguageService lenguageService;

    public Controllers(LenguageService lenguageService) {
        this.lenguageService = lenguageService;
    }

    @GetMapping("/")
    public String  helloWord(){
        return "hello cruel world";
    }

    @GetMapping("/api/v1/language")
    public List<Language> readLanguages(){
        return lenguageService.getAllLanguages();
    }

    @PostMapping("/api/v1/language")
    public ResponseEntity<String> createLanguage(@RequestBody Language language){
        return lenguageService.createLanguage(language);

    }
    @DeleteMapping("/api/v1/language/{id}")
    public ResponseEntity<String> deleteById(@PathVariable("id") Long id){
        return lenguageService.deleteById(id);

    }

    @GetMapping("/api/v1/language/{id}")
    public Language getById(@PathVariable("id") Long id){
        return lenguageService.getById(id);

    }
    @PutMapping("/api/v1/language/{id}")
    public ResponseEntity<String> updateLanguage(@RequestBody Language language, @PathVariable("id") Long id){
        return lenguageService.update(language, id);

    }
}
