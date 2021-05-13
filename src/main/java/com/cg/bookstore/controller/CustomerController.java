package com.cg.bookstore.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bookstore.entities.Customer;
import com.cg.bookstore.service.ICustomerService;

@RestController
@RequestMapping("/BookStore/Customer")
public class CustomerController {
@Autowired
ICustomerService icustomerService;
//create	
@PostMapping(path="/createCustomer")
public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer)
{
	Optional<Customer> o=icustomerService.createCustomer(customer);

	return new ResponseEntity<Customer>(o.get(),HttpStatus.OK);
}
//list
@GetMapping(path="/getallCustomers")
public ResponseEntity <List<Customer>> listCustomer ()
{
	List<Customer> list=icustomerService.listCustomers();
	
	return new ResponseEntity<List<Customer>>(list,HttpStatus.OK);
}
//delete
@DeleteMapping(path="/deleteCustomer")
public ResponseEntity<List<Customer>> deleteCustomer(@RequestBody Customer customer){
	List<Customer> o=icustomerService.deleteCustomer(customer);
	return new ResponseEntity<List<Customer>>(o,HttpStatus.OK);
}

//update
@PutMapping(path="/Update/{id}")
public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer,@PathVariable Integer id){
	Customer o=icustomerService.updateCustomer(customer,id);
	return new ResponseEntity<Customer>(o,HttpStatus.OK);
}
//view
@GetMapping(path="/viewCustomers")
public ResponseEntity<Customer> viewCustomer(@RequestBody Customer customer){
	Customer c=icustomerService.viewCustomer(customer);
	return new ResponseEntity<Customer>(c,HttpStatus.OK);
}

}