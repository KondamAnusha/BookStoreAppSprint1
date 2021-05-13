package com.cg.bookstore.service;

import java.util.List;
import java.util.Optional;
import java.util.function.IntPredicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

//import com.cg.bookstore.entities.Book;
import com.cg.bookstore.entities.Customer;
import com.cg.bookstore.repository.ICustomerRepository;
@Service
public class CustomerServiceImpl<customerId> implements ICustomerService{
@Autowired
ICustomerRepository customerRepo;
@Override
public Optional<Customer> createCustomer(Customer c) {
	// TODO Auto-generated method stub
	customerRepo.save(c);
	return Optional.of(c);
	
}
	
	
	public List<Customer> deleteCustomer(Integer id) {
		customerRepo.deleteById(id);;
		return customerRepo.findAll();
	}
	
	public Customer viewCustomer(Customer c) {
		return customerRepo.viewCustomer(c);
	
	}
//	public List<Customer> listAllCustomersByBook(Book book) {
//		return null;
//	}
	
	@Override
	public List<Customer> listCustomers() {
		// TODO Auto-generated method stub
		
		return customerRepo.findAll();
	}


	@Override
	public Customer updateCustomer(Customer c,Integer id) {
		// TODO Auto-generated method stub
		//return customerRepo.updateCustomer(c);
		
		
		return customerRepo.save(c);
		
	}


	@Override
	public List<Customer> deleteCustomer(Customer c) {
		customerRepo.delete(c);
		// TODO Auto-generated method stub
		return customerRepo.findAll();
	}


	@Override
	public IntPredicate updateCustomer(Customer cust) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Customer> deleteBook(int i) {
		// TODO Auto-generated method stub
		return null;
	}


	//@Override
//	public List<Customer> deleteCustomer(Customer c) {
	
//		// TODO Auto-generated method stub
//		return null;
//	}
}