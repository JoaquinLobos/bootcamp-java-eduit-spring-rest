package ar.com.eduducactionit.resources;

import java.util.List;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.eduducactionit.service.ApiService;
import ar.com.eduducactionit.service.impl.ApiServiceImpl;
@RestController

public class ApiFeignController implements ApiService {

	
	private ApiServiceImpl apiServiceImpl;
	
	public ApiFeignController(ApiServiceImpl apiServiceImpl) {
		this.apiServiceImpl = apiServiceImpl;
	}
	
	
	@Override
	@GetMapping("/v3.1/all")
	public List<Object> getCountries() {
		// TODO Auto-generated method stub
		return apiServiceImpl.getCountries();
	}




}
