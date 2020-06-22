package com.microservice.country.translation.enums;

import java.util.Arrays;

/**
 * @author MehmetAlpGuler
 */
public enum Country {
    ESTONIA ( "estonia", "ee"),
    BELGIUM ("belgium","be"),
    LITHUANIA( "lithuania", "lt"),
    UNKNOW("Unknow","en");

    private String name;
    private String language;

    public static Country fromString(String country) {
        return Arrays
                .stream(Country.values())
                .filter(v -> v.name.equals(country))
                .findFirst()
                .orElse(UNKNOW);
    }

    Country(String name, String language) {
        this.name = name;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }
}
