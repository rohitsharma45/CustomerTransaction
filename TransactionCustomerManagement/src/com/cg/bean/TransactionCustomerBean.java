package com.cg.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="CustomerTable")
@NamedQueries({
	@NamedQuery(name="retrieveAll",query="SELECT trans from TransactionCustomerBean trans"),
	@NamedQuery(name="retrieveId",query="SELECT trans.customerId from TransactionCustomerBean trans"),
	@NamedQuery(name="deleteById",query="DELETE from TransactionCustomerBean trans where trans.customerId=:cId")
})
public class TransactionCustomerBean {

	@Id
	@Column(name="cust_Id")
	private String customerId;
	
	@Column(name="cust_Name")
	@NotBlank(message=" Please enter your name")
	private String customerName;
	
	@Column(name="cust_Location")
	@NotEmpty(message="Please enter your location")
	private String location;
	
	@Column(name="cust_Domain")
	@NotBlank(message="Please enter your domain")
	private String domain;
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	
	@Override
	public String toString() {
		return "TransactionCustomerBean [customerId=" + customerId
				+ ", customerName=" + customerName + ", location=" + location
				+ ", domain=" + domain + "]";
	}
	
	
}
