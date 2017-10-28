package com.cg.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.bean.LoginBean;
import com.cg.bean.TransactionCustomerBean;
import com.cg.service.ITransactionService;

@Controller
public class LoginController {

	@Autowired
	ITransactionService service;
	
	@RequestMapping("/index")
	public String StartPage(Model model){
		model.addAttribute("logBean" ,new LoginBean());
		return "loginPage";
	}
	
	
	@RequestMapping("/checkLogin")
	public String check(@ModelAttribute("logBean") @Valid LoginBean lg,BindingResult br, Model model){
		List<LoginBean> logList = service.getLoginDetails();
		
		int flag = 0;
		
		for(LoginBean log:logList){

			if(lg.getUsername().equals(log.getUsername()) && lg.getPassword().equals(log.getPassword()) ){
				flag = 1;
				break;
			}
		}
		
		if(flag == 0){
			return "loginPage";
		}
		else{
			return "redirect:customer/choice.obj";
			
		}
	}}
