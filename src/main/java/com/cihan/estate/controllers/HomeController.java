package com.cihan.estate.controllers;

import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.hibernate.criterion.Distinct;
import org.hibernate.engine.transaction.jta.platform.internal.SynchronizationRegistryBasedSynchronizationStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cihan.estate.dao.CustomerDAO;
import com.cihan.estate.dao.EstateDAO;
import com.cihan.estate.dao.RealEstateAgentDAO;
import com.cihan.estate.dao.UserDAO;
import com.cihan.estate.models.Customer;
import com.cihan.estate.models.Estate;
import com.cihan.estate.models.RealEstateAgent;
import com.cihan.estate.models.StateEnum;
import com.cihan.estate.models.user.User;
import com.cihan.estate.utils.HashCodeCihan;

@Controller
public class HomeController {
	
	private String loginUser;
		
	@Autowired
	UserDAO userDao;
	
	@Autowired
	RealEstateAgentDAO realEstateAgentDAO;
	
	@Autowired
	CustomerDAO customerDAO;
	
	@Autowired
	EstateDAO estateDAO;
	
	@Autowired
	HashCodeCihan hashCodeCihan;
	
	@RequestMapping("/msg")
	@ResponseBody
	public String getMessage() {
		return "ilk Spring Projem";
	}
	
	@RequestMapping("/index")
	public String getOwnerName(Model model) {
		model.addAttribute("loginUser",loginUser);
		return "index";
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
			loginUser=user.getUsername();
			return "redirect:/index";
		}
		 else
		 {  if(!hashCodeCihan.decodeWord(user.getPassword()).equals(password))
			 {
				 System.out.println("Şifre Yanlış !!");
				 model.addAttribute("displayArea","Şifre Hatalı ");
				 return "login";
			 }
			 else {
				 loginUser=user.getUsername();
				 session.setAttribute("user", user);
				 return "redirect:/index";
			 }
		
		 }	
		}


	@RequestMapping(value="/estateprocess" , method = RequestMethod.POST )   
	public String urlVer(Locale locale, Model model, HttpSession session, @RequestParam int txtId) throws Exception {
		String page;
		switch (txtId) {
		case 1: page =  "realEstateAgent";break;
		case 2: page =  "customer";break;
		case 3: 
			page =  "estate";
			List<Customer> listC=customerDAO.search(new Customer());
			List<RealEstateAgent> listRea=realEstateAgentDAO.search(new RealEstateAgent());
			model.addAttribute("listC",listC);
			model.addAttribute("listRea",listRea);
			break;
		case 4: page =  "estateList";break;
		case 5: page =  "estateExcel";break;
		case 6: page =  "estateXML";break;
		case 7: page =  "estatePDF";break;
		default: page = "index";break;
		}
		return page;   
						
	}
	
	@RequestMapping(value="/realEstateAgent", method = RequestMethod.POST  )
	public ModelAndView saveRea(Locale locale, Model model, HttpSession session, 
			@RequestParam String reaname, 
			@RequestParam String ownernamesurname,
			@RequestParam String mobilephone, 
			@RequestParam String fax,
			@RequestParam String address) throws Exception {
		
		RealEstateAgent rea = new RealEstateAgent();
		ModelAndView mav= new ModelAndView();
		
		rea.setAgentName(reaname);
		rea.setOwnerNameSurname(ownernamesurname);
		rea.setMobilePhone(mobilephone);
		rea.setFax(fax);
		rea.setAddress(address);
		rea.setInsertDate(new Date());
		rea.setState(StateEnum.YENIGIRIS);
		realEstateAgentDAO.save(rea);
		mav.addObject("displayArea","Kayıt İşlemi Gerçekleşti ");
		return mav;
	}
	

	@RequestMapping(value="/customer", method = RequestMethod.POST  )
	public ModelAndView saveCutomer(Locale locale, Model model, HttpSession session, 
			@RequestParam String customertype,
			@RequestParam String name, 
			@RequestParam String surname,
			@RequestParam String mobilephone, 
			@RequestParam String email) throws Exception {
		
		Customer customer = new Customer();
		ModelAndView mav= new ModelAndView();
		
		customer.setCustomerType(Integer.valueOf(customertype));
		customer.setName(name);
		customer.setSurname(surname);
		customer.setMobilephone(mobilephone);
		customer.setEmail(email);
		customer.setInsertDate(new Date());
		customer.setState(StateEnum.YENIGIRIS);
		customerDAO.save(customer);
		mav.addObject("displayArea","Kayıt İşlemi Gerçekleşti ");
		return mav;
	}

	@RequestMapping(value="/estate", method = RequestMethod.POST  )
	public void saveEstate(Locale locale, Model model, HttpSession session, 
			@RequestParam String agentid,
			@RequestParam String customerid,
			@RequestParam String estatetype,
			@RequestParam String estatestate,
			@RequestParam String price,
			@RequestParam String roomnumber,
			@RequestParam String size, 
			@RequestParam String floor,
			@RequestParam String buildingage,
			@RequestParam String buildingtype,
			@RequestParam String warmingtype,
			@RequestParam String deedtype,
			@RequestParam String address			
			) throws Exception {
		
		Estate estate = new Estate();
			
		RealEstateAgent reaa= realEstateAgentDAO.findId(Integer.valueOf(agentid),new RealEstateAgent());
		Customer cuss= customerDAO.findId(Integer.valueOf(customerid), new Customer());
			
		estate.setRealEstateAgent(reaa);
		estate.setCustomer(cuss);
		estate.setEstateType(estatetype);
		estate.setEstateState(estatestate);
		estate.setRoomNumber(roomnumber);
		if(size!=null && !size.equals(""))  estate.setSize(Integer.valueOf(size));
		if(price!=null && !price.equals(""))  estate.setPrice(Long.parseLong(price));
		estate.setFloor(floor);
		estate.setBuildingAge(buildingage);
		estate.setBuildingType(buildingtype);
		estate.setWarmingType(warmingtype);
		estate.setDeedType(deedtype);
		estate.setAddress(address);
		estate.setInsertDate(new Date());
		estate.setState(StateEnum.YENIGIRIS);
		estateDAO.save(estate);
		List<Customer> listC=customerDAO.search(new Customer());
		List<RealEstateAgent> listRea=realEstateAgentDAO.search(new RealEstateAgent());
		model.addAttribute("listC",listC);
		model.addAttribute("listRea",listRea);
		model.addAttribute("displayArea","Kayıt İşlemi Gerçekleşti ");
	}
	
	@RequestMapping(value="/estateList", method = RequestMethod.POST  )
	public void getEstate(Locale locale, Model model, HttpSession session,
			@RequestParam String estateType1,
			@RequestParam String estateState1, 
			@RequestParam String price1,
			@RequestParam String price2) throws Exception {
		
		//Customer customer = new Customer();

		List<Estate> listEstate = estateDAO.searchEstate(estateType1,estateState1,price1,price2,new Estate());
		List<Customer> listC=customerDAO.search(new Customer());
		List<RealEstateAgent> listRea=realEstateAgentDAO.search(new RealEstateAgent());		
		model.addAttribute("listEstate",listEstate);
		model.addAttribute("listC",listC);
		model.addAttribute("listRea",listRea);
		
	} 
	
}
