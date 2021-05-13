package com.cg.bookstore.repository;

import java.lang.annotation.Repeatable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.bookstore.entities.Customer;
@Repository
public interface ICustomerRepository extends JpaRepository<Customer,Integer>{
	@Query(value="select count(customer_id) from customer",nativeQuery=true)
	public int customerCount();
//	
//@Query(value="insert into customer values(c)")
	//public Optional<Customer> createCustomer(Customer c);
//	
@Query(value="Select c from Customer c")
	public Customer listCustomers();


//public Customer createCustomer(Customer c);
//public List<Customer> listCustomers();
//public Customer deleteCustomer(Customer c);
//public Customer updateCustomer(Customer c);

	@Query(value="select *from Customer",nativeQuery=true)
	public Customer viewCustomer(Customer c);
}



