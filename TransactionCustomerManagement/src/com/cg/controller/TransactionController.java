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
import org.springframework.web.servlet.ModelAndView;

import com.cg.bean.TransactionCustomerBean;
import com.cg.service.ITransactionService;

@Controller
@RequestMapping("/customer")
public class TransactionController {

	@Autowired
	ITransactionService service;
	
	@RequestMapping("/choice")
	public String goToStart(){
		
		return "options";
	}
	
	@RequestMapping("/add")
	public String goToForm(Model model){

		model.addAttribute("trainee", new TransactionCustomerBean());
		return "customerRegForm";
	}
	
	@RequestMapping("/reg")
	public String registration(@ModelAttribute("trainee") @Valid TransactionCustomerBean trans,BindingResult br, Model model){
		
		if(br.hasErrors())
		{
			return "traineeRegForm";
		}
		else{
			service.addDetails(trans);
			model.addAttribute("k", trans);
			return "traineeSuccess";
		}
	}
	
	@RequestMapping("/goDelete")
	public ModelAndView goToDelete(Model model){
		
		List<String> idList= service.retrieveIds();
		return new ModelAndView("customerIdDelete", "idList", idList);
	}
	
	@RequestMapping("/delete")
	public String deleteById(@RequestParam("customerId") String customerId, Model model){
		service.deleteCustomer(customerId);
		model.addAttribute("customerId", customerId);
		return "deleteSuccess";
	}
	
	@RequestMapping("/goFindAll")
	public ModelAndView findAll(){
		
		List<TransactionCustomerBean> custList = service.retrieveDetails();
		return new ModelAndView("CustomerListSuccess", "list", custList);
	}
	
	
}
