/**
 * 
 */
package com.example.SubmissionForm;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author HP
 *
 */
@Controller
public class FormController {

	@Autowired
	public CustomerRepo repo;

	@RequestMapping("/")
	public String details() {
		return "CustomerForm.jsp";

	}

	@RequestMapping("/details")
	public String details(Customers customer) {
		repo.save(customer);
		return "CustomerForm.jsp";

	}

	@RequestMapping("/getdetails")
	public String getdetails() {

		return "ViewCustomersDetails";

	}

	/*
	 * @GetMapping("/CustomerForm") public String formSubmission() { return
	 * "CustomerForm.jsp";
	 * 
	 * }
	 */
	@PostMapping("/getdetails")
	public ModelAndView getdetails(@RequestParam int cid)
	/*
	 * @RequestParam(value = "cname", required = false) String cname,
	 * 
	 * @RequestParam(value = "cemail", required = false) String cemail, ModelMap
	 * modelMap)
	 */
	{
		// return "CustomerForm.jsp";
		ModelAndView mv = new ModelAndView("Retrive");
		/*
		 * modelMap.put("cid", cid); modelMap.put("cname", cname);
		 * modelMap.put("cemail", cemail); return "ViewCustomersDetails";
		 */
		Customers customers = repo.findById(cid).orElse(null);
		mv.addObject(customers);
		return mv;

	}

	/*
	 * @RequestMapping("/customers")
	 * 
	 * @ResponseBody public String getCustomers() { return
	 * repo.findAll().toString();
	 * 
	 * }
	 */
	@RequestMapping("/customers")
	@ResponseBody
	public List<Customers> getCustomers() {
		return repo.findAll();

	}

	/*
	 * @RequestMapping("/customers/{cid}")
	 * 
	 * @ResponseBody public String getCustomersbyId(@PathVariable("cid") int
	 * cid) { return repo.findById(cid).toString();
	 * 
	 * }
	 */
	@RequestMapping("/customers/{cid}")
	@ResponseBody
	public Optional<Customers> getCustomersbyId(@PathVariable("cid") int cid) {
		return repo.findById(cid);
	}

	@PostMapping("/customers")
	public Customers getCustomerspost(@RequestBody Customers customers) {
		repo.save(customers);
		return customers;
	}

	@DeleteMapping("/customers/{cid}")
	public Customers getCustomersdelete(@PathVariable("cid") int cid) {
		Customers cust = repo.getOne(cid);
		repo.delete(cust);
		return cust;
	}

	@PutMapping(path = "/customers", consumes = { "application/json" })
	public Customers getCustomersput(@RequestBody Customers customers) {
		// Customers cust = repo.getOne(cid);
		repo.save(customers);
		return customers;
	}
}
