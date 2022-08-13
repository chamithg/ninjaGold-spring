package com.codingdojo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
@Controller
public class ninjaGold {
	
	@RequestMapping("/gold")
    public String gold(HttpSession session, Model model) {
		
		
		if(session.getAttribute("gold")==null) {
			ArrayList<String> actions = new ArrayList<>();
			session.setAttribute("gold", 0);
			session.setAttribute("actions", actions);
			model.addAttribute("gold", session.getAttribute("gold"));
			model.addAttribute("actions", session.getAttribute("actions"));
		}else {
			model.addAttribute("gold", session.getAttribute("gold"));
			model.addAttribute("actions", session.getAttribute("actions"));
		}
		return "index.jsp";
	}
	
	@RequestMapping("/gold/{option}")
    public String play(@PathVariable("option") String option,HttpSession session) {
		
		Date date = new Date();
		
		Random random = new Random();
		if(option.equals("farm")) {
			int temp = (int) session.getAttribute("gold");
			int add = random.nextInt(20 - 10) + 10;
			ArrayList <String> tempArray = (ArrayList<String>) session.getAttribute("actions");
			tempArray.add(0,"you entererd farm and earned " + add +" gold.("+ date +")" );
			session.setAttribute("gold", temp + add);
		}
		if(option.equals("cave")) {
			int temp = (int) session.getAttribute("gold");
			int add = random.nextInt(10 - 5) + 5;
			ArrayList <String> tempArray = (ArrayList<String>) session.getAttribute("actions");
			tempArray.add(0,"you entererd cave and earned " + add +" gold.("+ date +")" );
			session.setAttribute("gold", temp + add);
		}
		if(option.equals("house")) {
			int temp = (int) session.getAttribute("gold");
			int add = random.nextInt(5 - 2) + 2;
			ArrayList <String> tempArray = (ArrayList<String>) session.getAttribute("actions");
			tempArray.add(0,"you entererd house and earned " + add +" gold.("+ date +")" );
			session.setAttribute("gold", temp + add);
		}
		if(option.equals("quest")) {
			int temp = (int) session.getAttribute("gold");
			int add = random.nextInt(50 +50)-50;
			ArrayList <String> tempArray = (ArrayList<String>) session.getAttribute("actions");
			if(add<0) {
				tempArray.add(0,"you failed a quest and lost " + add +" gold.("+ date +")" );
			}else {
				tempArray.add(0,"you passed a quest and earned " + add +" gold.("+ date +")" );
			}
			
			session.setAttribute("gold", temp + add);
		}
		return "redirect:/gold";
	}
	
	

}
