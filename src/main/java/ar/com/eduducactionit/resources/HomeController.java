package ar.com.eduducactionit.resources;

import javax.swing.text.View;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	
	@GetMapping(value = "/")
	public String Home() {
	
		return ("index");
	}
}
