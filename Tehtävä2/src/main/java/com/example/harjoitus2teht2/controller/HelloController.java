package com.example.harjoitus2teht2.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.harjoitus2teht2.domain.Student;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String hello(Model model) {

		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("Kate", "Cole", "kate.cole@example.com"));
		students.add(new Student("Dan", "Brown", "dan.brow@example.com"));
		students.add(new Student("Mike", "Mars", "mike.mars@example.com"));
		
		model.addAttribute("students", students);
				
		return "list";
	}

}
