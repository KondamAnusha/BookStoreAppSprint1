package com.cg.bookstore;

import java.util.List;
import java.util.Optional;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.cg.bookstore.entities.Customer;
import com.cg.bookstore.repository.ICustomerRepository;
import com.cg.bookstore.service.ICustomerService;
@SpringBootTest
public class CustomerControllerTest extends BookStoreManagementAppApplicationTests{
	
	@Autowired
	ICustomerRepository customerRepo;

@Autowired
ICustomerService iCustomerService;

@Test
 void getallCustomers() {
	int count=customerRepo.customerCount();
	List<Customer> list=customerRepo.findAll();
	 assertEquals(count,list.size());	
}
//
//@Test
//void delete() {
//	List<Customer> customer1=customerRepo1.findAll();
//	List<Customer> customer2=iCustomerService.deleteBook(5);
//	 assertThat(customer1.size()-1).isEqualTo(customer2.size());
//}


//
//@Test
//void update() {
//	Optional<Customer> b=customerRepo1.findById(1);
//	Customer book=iCustomerService.editCustomer(b.get(),1);
//	assertThat(customerRepo1.count()).isEqualTo(customerRepo1.customerCount());
//}
//
////@Test
////void create() {
	// Customer b=new Customer(8,"poojitha@gmail.com","poojitha","","9846625978","charng",LocalDate.now(),
////		LocalDate.now(),new Address());
////	List<Customer> customer1=customerRepo1.findAll();
////	customerRepo1.save(b);
////	List<Customer> customer2=customerRepo1.findAll();
////	assertThat(customer1.size()+1).isEqualTo(customer2.size());		

//@Test
//void viewCustomers() {
//	Customer c=new Customer();
//	List
//}

}
