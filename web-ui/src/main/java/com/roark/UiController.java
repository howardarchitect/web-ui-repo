package com.roark;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UiController {

	@GetMapping({ "/", "","/hello" })
	public String home(@RequestParam(value = "name", defaultValue = "Hello", required = false) String name,
			Model model) {
		model.addAttribute("name", name);
		return "hello";

	}

}
