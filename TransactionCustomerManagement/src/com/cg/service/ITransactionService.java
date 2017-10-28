package com.cg.service;

import java.util.List;

import com.cg.bean.LoginBean;
import com.cg.bean.TransactionCustomerBean;



public interface ITransactionService {

	List<LoginBean> getLoginDetails();

	void addDetails(TransactionCustomerBean trans);

	List<String> retrieveIds();

	void deleteCustomer(String customerId);

	List<TransactionCustomerBean> retrieveDetails();



	

}
