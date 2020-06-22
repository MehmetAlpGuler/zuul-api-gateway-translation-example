package com.microservice.country.translation;

import com.microservice.country.translation.enums.Country;
import com.microservice.country.translation.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TranslationController {

    @Autowired
    private CountryServiceProxy proxy;

    @GetMapping("/{country}/{word}")
    public EntityModel<TranslationBean> convertCurrencyFeign(@PathVariable String country, @PathVariable String word) {
        Country countryEnum = Country.fromString(country);
        if (countryEnum == Country.UNKNOW)
            throw new NotFoundException(String.format("Country %s can not found ", country));

        TranslationBean response = proxy.retrieveExchangeValue(country, word);
        response.setTranslate(firtCharacterSetUppercase(response.getTranslate()));

        return EntityModel.of(response);
    }

    private String firtCharacterSetUppercase(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }

}
