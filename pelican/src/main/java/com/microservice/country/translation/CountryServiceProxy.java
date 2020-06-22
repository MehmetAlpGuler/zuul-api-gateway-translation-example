package com.microservice.country.translation;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="netflix-zuul-api-gateway-server")
//@RibbonClient(name="currency-exchange-service")
public interface CountryServiceProxy {
	@GetMapping("/{country}/translation/{word}")
	public TranslationBean retrieveExchangeValue
	(@PathVariable("country") String country, @PathVariable("word") String word);
}

