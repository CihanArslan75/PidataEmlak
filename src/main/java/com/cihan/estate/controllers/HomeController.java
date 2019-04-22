package com.cihan.estate.controllers;

import java.util.Date;
import java.util.Locale;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cihan.estate.dao.RealEstateAgentDAO;
import com.cihan.estate.dao.UserDAO;
import com.cihan.estate.models.RealEstateAgent;
import com.cihan.estate.models.StateEnum;
import com.cihan.estate.models.user.User;
import com.cihan.estate.utils.HashCodeCihan;

@Controller
public class HomeController {
	
	
	@Autowired
	UserDAO userDao;
	
	@Autowired
	RealEstateAgentDAO realEstateAgentDAO;
	
	@Autowired
	HashCodeCihan hashCodeCihan;
	
	@RequestMapping("/msg")
	@ResponseBody
	public String getMessage() {
		return "ilk Spring Projem";
	}
	
	@RequestMapping("/index")
	public String getOwnerName() {
		return "index";
	}
	
	
	@RequestMapping("/estate")
	public String getEstate() {
		return "estate";
	}
	
	@RequestMapping("/customer")
	public String getCustomer() {
		return "customer";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@GetMapping("/password-reset-request")
	public String loginPost(Locale locale, Model model, HttpSession session, @RequestParam String username, @RequestParam String password) throws Exception {
		System.out.println("1");
		User user = userDao.searchUsr("username",username,new User());
			
		if(user == null){
			model.addAttribute("error", "kullanıcı adı veya şifre hatalı!");
			System.out.println("user yok");
			user = new User();
			user.setUsername(username);
			user.setPassword(hashCodeCihan.encodeWord(password));
			user.setInsertDate(new Date());
			user.setState(StateEnum.YENIGIRIS);
			userDao.save(user);
			return "redirect:/index";
		}
		 else
		 {
			 if(!user.getPassword().equals(hashCodeCihan.decodeWord(password)))
			 {
				 System.out.println("Şifre Yanlış !!");
				 return "redirect:/index";
			 }
			 else {
				 return "redirect:/index";
			 }
		
		 }	
		
		//session.setAttribute("user", user);
		//return "index";
		
	}


//	private String url="index.jsp";
//	private int id=1;
	
	@RequestMapping(value="/estateprocess" , method = RequestMethod.POST )   
	public String urlVer(Locale locale, Model model, HttpSession session, @RequestParam int txtId) throws Exception {
		String page;
		switch (txtId) {
		case 1: page =  "realEstateAgent";break;
		case 2: page =  "customer";break;
		case 3: page =  "estate";break;
		case 4: page =  "estateList";break;
		case 5: page =  "estateExcel";break;
		case 6: page =  "estateXML";break;
		case 7: page =  "estatePDF";break;
		default: page = "index";break;
		}
		return page;   
						
	}
	
	
	
	@RequestMapping(value="/realEstateAgent", method = RequestMethod.POST  )
	public String getRea(Locale locale, Model model, HttpSession session, 
			@RequestParam String reaname, 
			@RequestParam String ownernamesurname,
			@RequestParam String mobilephone, 
			@RequestParam String fax,
			@RequestParam String address) throws Exception {
		
		System.out.println("23333");
		RealEstateAgent rea = new RealEstateAgent();
		
		rea.setAgentName(reaname);
		rea.setOwnerNameSurname(ownernamesurname);
		rea.setMobilePhone(mobilephone);
		rea.setFax(fax);
		rea.setAddress(address);
		rea.setInsertDate(new Date());
		rea.setState(StateEnum.YENIGIRIS);
		realEstateAgentDAO.save(rea);
		return "realEstateAgent";
	}
	
	
//	public int getId() {
//		return id;
//	}
//
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//
//	public String getUrl() {
//		return url;
//	}
//
//
//	public void setUrl(String url) {
//		this.url = url;
//	}
//	
}
