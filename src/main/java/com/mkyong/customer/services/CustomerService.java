package com.mkyong.customer.services;

import javax.inject.Inject;
import javax.inject.Named;

import com.mkyong.customer.dao.CustomerDAO;
import com.mkyong.customer.entity.BadCustomer;

@Named
public class CustomerService {
	@Inject
	private CustomerDAO customerDAO;

	@Inject
	private BadCustomer badCustomer;

	public void save() {

		System.out.println("CustomerService save method...");
		customerDAO.save();

		System.out.println("bad customer character...");

		badCustomer.character();

	}

}
