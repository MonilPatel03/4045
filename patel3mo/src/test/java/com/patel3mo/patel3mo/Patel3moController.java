package com.patel3mo.patel3mo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
	
public class Patel3moController {
	
	@RequestMapping ("/start")
	public String start() {
		return "start";
	}

}
