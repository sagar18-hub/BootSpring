/**
 * 
 */
package com.example.SubmissionForm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

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
		
		return "ViewCustomersDetails.jsp";

	}
	/*@GetMapping("/CustomerForm")
	public String formSubmission() {
		return "CustomerForm.jsp";

	}*/

/*	public String viewdetails(@RequestParam(value = "cid", required = false) int cid,
			@RequestParam(value = "cname", required = false) String cname,
			@RequestParam(value = "cemail", required = false) String cemail, ModelMap modelMap) {
		// return "CustomerForm.jsp";
		modelMap.put("cid", cid);
		modelMap.put("cname", cname);
		modelMap.put("cemail", cemail);
		return "ViewCustomersDetails";

	}*/
}
