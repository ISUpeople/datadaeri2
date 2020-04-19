package com.example.datadaeri2.db;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "data")
public class ParaphraseData extends Data{

    public String paraphraseClass;
    public String paraphrase;

    public void setParaphraseClass(String paraphraseClass){
        this.paraphraseClass = paraphraseClass;
    }   

    public String getParaphraseClass(){
        return paraphraseClass;
    }

    public void setParaphrase(String paraphrase){
        this.paraphrase = paraphrase;
    }   

    public String getParaphrase(){
        return paraphrase;
    }
}