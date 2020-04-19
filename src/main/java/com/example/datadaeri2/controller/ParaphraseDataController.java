package com.example.datadaeri2.controller;

import java.util.List;

import com.example.datadaeri2.db.ParaphraseDataRepository;
import com.example.datadaeri2.db.ParaphraseData;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class ParaphraseDataController {

    private final ParaphraseDataRepository repository;

    ParaphraseDataController(ParaphraseDataRepository repository){
        this.repository = repository;
    }

    @GetMapping("/paraphraseData")
    List<ParaphraseData> all(){
        return repository.findAll();
    }

    @PostMapping("/paraphraseData")
    ParaphraseData newTranslationData(@RequestBody ParaphraseData newTranslationData){
        return repository.save(newTranslationData);
    }
    
}