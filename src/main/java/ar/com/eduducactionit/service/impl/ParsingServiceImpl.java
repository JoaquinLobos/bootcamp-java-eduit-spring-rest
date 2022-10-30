package ar.com.eduducactionit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import ar.com.eduducactionit.service.ParsingService;

@Service
public class ParsingServiceImpl implements ParsingService{

	@Autowired
	public RestTemplate restTemplate;
	
	
	@Override
	public Object parse(String url){
		return restTemplate.getForObject(url, Object.class);
	}
	
}
