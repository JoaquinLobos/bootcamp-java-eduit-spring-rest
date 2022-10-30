package ar.com.eduducactionit.service.impl;

import org.springframework.cloud.openfeign.FeignClient;

import ar.com.eduducactionit.service.ApiService;

@FeignClient(name = "api-service", url = "https://restcountries.com/")
public interface ApiServiceImpl extends ApiService {

	
	
	
}
