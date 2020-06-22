package com.microservice.currencyexchangeservice;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Translation {

    @Id
    private Long id;
    private String word;
    private String translate;
    private String country;

    public Translation() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
