package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
/*
	@RequestMapping("/index")
	public String index() {
		return "This is the main page";
	}

	@RequestMapping("/contact")
	public String contact() {
		return "This is the contact page";
	}
*/
	@RequestMapping("/hello")
	public String hello(@RequestParam(name = "name", required = false) String name,
			@RequestParam(name = "age", required = false) Integer age, Model model) {
		model.addAttribute("age", age);
		model.addAttribute("name", name);
		return "hello";
	}

	/*
	 * @RequestMapping(value="/hello", method=RequestMethod.GET) public String
	 * greetingForm(Model model) { model.addAttribute("message", new Message());
	 * return "hello"; }
	 * 
	 * @RequestMapping(value="/hello", method=RequestMethod.POST) public String
	 * greetingSubmit(@ModelAttribute Message msg, Model model) {
	 * model.addAttribute("message", msg); return "result"; }
	 */
}