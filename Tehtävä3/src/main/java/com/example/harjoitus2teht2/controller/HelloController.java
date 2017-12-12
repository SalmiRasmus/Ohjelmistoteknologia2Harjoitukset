package com.example.harjoitus2teht2.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.harjoitus2teht2.domain.Friend;

@Controller
public class HelloController {

	/*@RequestMapping("/index")
	public String index(Model model) {


				
		return "list";
	}*/
	
	/*@RequestMapping("/index")
	public String index() {
	
		model.addAttribute("friend", friend);
		return "list";
	}*/

    @RequestMapping(value="/index", method=RequestMethod.GET)
    public String greetingForm(@RequestParam(name = "name") String name, @ModelAttribute Friend friend, Model model) {
		ArrayList<Friend> friends = new ArrayList<Friend>();
		friends.add(new Friend("Nigga Nugga"));
		friends.add(new Friend(name));
		model.addAttribute("friend", friend);
		model.addAttribute("friends", friends);
        return "list";
    }
 
    /*@RequestMapping(value="/index", method=RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute Friend friend, Model model) {
    	model.addAttribute("friend", friend);
        return "list";
    }*/
	

}
