package com.cihan.estate.controllers;

import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cihan.estate.dao.UserDAO;
import com.cihan.estate.models.StateEnum;
import com.cihan.estate.models.user.User;

@Controller
public class HomeController {
	
	@Autowired
	UserDAO dao;
	
	@RequestMapping("/msg")
	@ResponseBody
	public String getMessage() {
		return "ilk Spring Projem";
	}
	
	@RequestMapping("/index")
	@ResponseBody
	public ModelAndView getOwnerName() {
		ModelAndView mav= new ModelAndView();
		mav.addObject("owner","Cihan Arslan");
		mav.setViewName("index"); // sayfanını adı
		return mav;
	}


	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginPost(Locale locale, Model model, HttpSession session, @RequestParam String username, @RequestParam String password) throws Exception {
		System.out.println("1");
		User user = dao.searchLoginUser(username,password,new User());
		System.out.println("user:"+user);
		if(user == null){
			model.addAttribute("error", "kullanıcı adı veya şifre hatalı!");
			System.out.println("user yok");
			user = new User();
			user.setUsername(username);
			user.setPassword(password);
			user.setInsertDate(new Date());
			user.setState(StateEnum.YENIGIRIS);
			dao.save(user);
			return "redirect:/login/";
		}
		
		if(session.getAttribute("user") != null){
			session.removeAttribute("user");
		}
		session.setAttribute("user", user);
		
		
		return "redirect:/login/";
		
	}

}
