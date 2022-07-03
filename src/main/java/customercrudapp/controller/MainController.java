package customercrudapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import customercrudapp.dao.CustomerDao;
import customercrudapp.model.Customer;

@Controller
public class MainController {
	

@Autowired
private CustomerDao customerDao;
 
@RequestMapping("/")
 public String home(Model m) {
	List<Customer>customers=customerDao.getCustomers();
	m.addAttribute("customer", customers);
	return "index";
	 
 }

@RequestMapping("/add-customer")
public String addCustomer(Model m) {
	m.addAttribute("title","Add Customer");
	return "add_customer_form";
}

@RequestMapping(value="/handle-customer",method=RequestMethod.POST)
public RedirectView handleCustomer(@ModelAttribute Customer customer,HttpServletRequest request) 
{ 
	System.out.println(customer);
	this.customerDao.createCustomer(customer);
	 RedirectView redirectview= new RedirectView();
	 redirectview.setUrl(request.getContextPath()+"/");
	 return redirectview;
}
@RequestMapping(value="/delete/{customerid}",method=RequestMethod.GET)
public RedirectView delete(@PathVariable("customerid")int id ,HttpServletRequest  request) 
{
	this.customerDao.deleteCustomer(id);
	RedirectView redirectview= new RedirectView();
	 redirectview.setUrl(request.getContextPath()+"/");
	 return redirectview;
}
@RequestMapping(value="/update/{customerid}")
public String updateForm(@PathVariable("customerid")int id,Model model) 
{
	Customer cus=customerDao.getCustomer(id);
	model.addAttribute("customer",cus);
	return"update_form";
}
}
