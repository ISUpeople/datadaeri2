package com.example.datadaeri2.db;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(collectionResourceRel = "translation_data", path = "translation_data")
public interface ParaphraseDataRepository extends MongoRepository<ParaphraseData, String>{

    //public void insertTranslationData(@Param("userId") String userId, 
    //@Param("quality") int quality, String date, @Param("task") String task, @Param("sourceLang") String sourceLang, 
    //@Param("targetLang") String targetLang, @Param("sourceText") String sourceText, @Param("targetText") String targetText);
}