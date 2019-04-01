package com.tampro.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tampro.Service.ContactService;

@Controller
public class MainController {
	
	@Autowired
	ContactService contactService;

	@RequestMapping(path = Constant.Trang_Chu)
	public String index(ModelMap map)
	{
		//map.addAttribute("listcontact", contactService.getAllContact());
		return "index";
	}
	@RequestMapping(path = Constant.new_Contact)
	public String contact(ModelMap map)
	{
	   	
		return "contact";
	}
	
	@RequestMapping(path = Constant.update_Contact)
	public String updatecontact(ModelMap map)
	{
	   	
		return "update";
	}




	
}
