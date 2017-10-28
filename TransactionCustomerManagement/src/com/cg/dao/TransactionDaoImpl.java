package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.bean.LoginBean;
import com.cg.bean.TransactionCustomerBean;

@Repository
@Transactional
public class TransactionDaoImpl implements ITransactionDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<LoginBean> getLoginDetails() {
		TypedQuery<LoginBean> query = entityManager.createNamedQuery("getCredentials", LoginBean.class);
		List<LoginBean> list = query.getResultList();
		return list;
	}

	@Override
	public void addDetails(TransactionCustomerBean trans) {
		entityManager.persist(trans);
		entityManager.flush();
	}

	@Override
	public List<String> retrieveIds() {
		TypedQuery<String> query=entityManager.createNamedQuery("retrieveId",String.class);
		List<String> idList = query.getResultList();
		return idList;
	}

	@Override
	public void deleteCustomer(String customerId) {
		
		Query query = entityManager.createNamedQuery("deleteById").setParameter("cId", customerId);
		query.executeUpdate();
	}

	@Override
	public List<TransactionCustomerBean> retrieveDetails() {
		TypedQuery<TransactionCustomerBean> query = entityManager.createNamedQuery("retrieveAll", TransactionCustomerBean.class);
		List<TransactionCustomerBean> list = query.getResultList();
		return list;
	}

}
