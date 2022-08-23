package com.demo.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/")
    public String index(final Model model) {
		model.addAttribute("title", "Komera Purushotham - Devops Engineer");
		model.addAttribute("msg", "Over 3+ years of experience with DevOps and System Engineering in Multi Cloud environments such as AWS, GCP, AZURE for managing servers hosted on them.");
		return "index";
  }

}
