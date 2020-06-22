package com.microservice.country.translation;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="netflix-zuul-api-gateway-server")
public interface CountryServiceProxy {
	@GetMapping("/{country}/translation/{word}")
	TranslationBean retrieveExchangeValue
	(@PathVariable("country") String country, @PathVariable("word") String word);
}

