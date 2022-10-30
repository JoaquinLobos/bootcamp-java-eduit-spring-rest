package ar.com.eduducactionit.service;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

public interface ApiService {

	@GetMapping("/v3.1/all")
	public List<Object> getCountries();
	

}
