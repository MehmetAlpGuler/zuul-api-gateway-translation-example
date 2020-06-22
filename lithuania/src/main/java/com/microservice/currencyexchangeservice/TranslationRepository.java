package com.microservice.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TranslationRepository extends
		JpaRepository<Translation, Long> {
	Translation findByWord(String Word);
}
