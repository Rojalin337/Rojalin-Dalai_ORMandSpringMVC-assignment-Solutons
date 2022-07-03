package customercrudapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import customercrudapp.model.Customer;
import javax.transaction.Transactional;


@Component
public class CustomerDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//Create
	@Transactional
	public void createCustomer(Customer customer)
	{
		this.hibernateTemplate.saveOrUpdate(customer);
	}
	
	//get all Customers
	public List<Customer>getCustomers()
	{
		List<Customer>customers=this.hibernateTemplate.loadAll(Customer.class);
		return customers;
	}
	
	//delete single customer
	@Transactional
	public void deleteCustomer(int cid) {
		Customer cus = this.hibernateTemplate.load(Customer.class, cid);
		this.hibernateTemplate.delete(cus);
	}
	
	// get the single product
		public Customer getCustomer(int cid) {
			return this.hibernateTemplate.get(Customer.class, cid);
		}
}
