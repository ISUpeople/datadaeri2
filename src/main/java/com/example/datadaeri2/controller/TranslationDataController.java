package com.example.datadaeri2.controller;

import java.util.List;

import com.example.datadaeri2.db.TranslationDataRepository;
import com.example.datadaeri2.db.TranslationData;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class TranslationDataController {

    private final TranslationDataRepository repository;

    TranslationDataController(TranslationDataRepository repository){
        this.repository = repository;
    }

    @GetMapping("/transtionData")
    List<TranslationData> all(){
        return repository.findAll();
    }

    @PostMapping("/transtionData")
    TranslationData newTranslationData(@RequestBody TranslationData newTranslationData){
        return repository.save(newTranslationData);
    }
    
}