/**
 * 
 */
package com.example.SubmissionForm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author HP
 *
 */
@Controller
public class FormController {

	@Autowired
	public CustomerRepo repo;

	@RequestMapping(value = "/CustomerForm")
	// @GetMapping("/CustomerForm")
	public String formSubmission(Customers customers) {
		return "CustomerForm.jsp";

	}

	@RequestMapping(value = "/CustomerForm", method = RequestMethod.GET)
	// @GetMapping("/CustomerForm")
	public String formSubmission() {
		return "CustomerForm.jsp";

	}

	// @PostMapping("/details")
	@RequestMapping(value = "/details", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public String viewdetails(@RequestParam("cid") int cid,
			@RequestParam("cname") String cname,
			@RequestParam("cemail") String cemail, ModelMap modelMap) {
		// return "CustomerForm.jsp";
		modelMap.put("cid", cid);
		modelMap.put("cname", cname);
		modelMap.put("cemail", cemail);
		return "	";

	}
}
