package com.example.datadaeri2.db;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "data")
public class TranslationData extends Data{

    private String sourceLang;
    private String targetLang;
    private String sourceText;
    private String targetText;

    public void setSourceLang(String sourceLang){
        this.sourceLang = sourceLang;
    }   

    public String getSourceLang(){
        return sourceLang;
    }

    public void setTargetLang(String targetLang){
        this.targetLang = targetLang;
    }   

    public String getTargetLang(){
        return targetLang;
    }

    public void setSourceText(String sourceText){
        this.sourceText = sourceText;
    }   

    public String getSourceText(){
        return sourceText;
    }

    public void setTargetText(String targetText){
        this.targetText = targetText;
    }   

    public String getTargetText(){
        return targetText;
    }
}