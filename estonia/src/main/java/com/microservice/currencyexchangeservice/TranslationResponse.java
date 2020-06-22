package com.microservice.currencyexchangeservice;

public class TranslationResponse {

    private String translate;

    public TranslationResponse() {
    }

    public TranslationResponse(String translate) {
        this.translate = translate;
    }

    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }

    @Override
    public String toString() {
        return "TranslationResponse{" +
                "translate='" + translate + '\'' +
                '}';
    }
}
