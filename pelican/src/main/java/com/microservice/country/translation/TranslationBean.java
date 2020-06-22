package com.microservice.country.translation;

public class TranslationBean {

    private String translate;

    public TranslationBean() {
    }

    public TranslationBean(String translate) {
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
