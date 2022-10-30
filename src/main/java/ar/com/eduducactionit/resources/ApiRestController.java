package ar.com.eduducactionit.resources;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import ar.com.eduducactionit.domain.Sites;
import ar.com.eduducactionit.service.ParsingService;


@RestController
@RequestMapping("/mercadolibre")
public class ApiRestController {

	@Autowired
	private ParsingService parsingService;
	
	private String url = "https://api.mercadolibre.com/sites";
	
	@GetMapping("/sites")
	public List<?> getSites(final Model model){
		
		List<Sites> sites = (List<Sites>) parsingService.parse(url);
		return sites;
		
	}
	
}
