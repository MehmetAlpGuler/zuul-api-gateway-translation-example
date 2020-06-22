package com.microservice.currencyconversionservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class TranslationController {

	@Autowired
	private CountryServiceProxy proxy;

	@GetMapping("/{country}/{word}")
	public TranslationBean convertCurrencyFeign(@PathVariable String country, @PathVariable String word) {

		TranslationBean response = proxy.retrieveExchangeValue(country, word);

		return response;
	}

}
