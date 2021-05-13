package com.cg.bookstore.service;

import java.util.List;
import java.util.Optional;
import java.util.function.IntPredicate;

import org.springframework.beans.factory.annotation.Autowired;

//import com.cg.bookstore.entities.Book;
import com.cg.bookstore.entities.Customer;
import com.cg.bookstore.repository.ICustomerRepository;

public interface ICustomerService {
	

	public  Optional<Customer> createCustomer(Customer c);

	public List<Customer> listCustomers();
	public List<Customer> deleteCustomer(Customer customer);
	
	public Customer updateCustomer(Customer c,Integer id);
	
	public Customer viewCustomer(Customer c);
	//public List<Customer> listAllCustomersByBook(Book book);

	public IntPredicate updateCustomer(Customer cust);

	public List<Customer> deleteBook(int i);

	
	
}
