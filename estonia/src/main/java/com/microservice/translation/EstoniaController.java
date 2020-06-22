package com.microservice.translation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstoniaController {

    @Autowired
    private TranslationRepository repository;

    @GetMapping("/translation/{word}")
    public TranslationResponse retrieveWordValue(@PathVariable String word) {
        Translation exchangeValue = repository.findByWord(word);

        return new TranslationResponse(exchangeValue.getTranslate().toLowerCase());
    }
}
