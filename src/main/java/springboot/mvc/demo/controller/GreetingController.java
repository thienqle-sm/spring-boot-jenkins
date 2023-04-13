package springboot.mvc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	//http://localhost:8080/greeting?name=Test
	@GetMapping("/")
	public String home() {
		
		return "index";
		
	}
	
	//http://localhost:8080/greeting?name=Test
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		
		model.addAttribute("name", name);
		return "greeting";
		
	}

}