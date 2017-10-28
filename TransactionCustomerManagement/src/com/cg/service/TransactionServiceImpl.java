package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.bean.LoginBean;
import com.cg.bean.TransactionCustomerBean;
import com.cg.dao.ITransactionDao;

@Service
@Transactional
public class TransactionServiceImpl implements ITransactionService{

	@Autowired
	ITransactionDao dao;
	
	@Override
	public List<LoginBean> getLoginDetails() {
		
		return dao.getLoginDetails();
	}

	@Override
	public void addDetails(TransactionCustomerBean trans) {
		
		dao.addDetails(trans);
	}

	@Override
	public List<String> retrieveIds() {
		
		return dao.retrieveIds();
	}

	@Override
	public void deleteCustomer(String customerId) {
		
		dao.deleteCustomer(customerId);
	}

	@Override
	public List<TransactionCustomerBean> retrieveDetails() {
		
		return dao.retrieveDetails();
	}


	

}
