/**
 * 
 */
package com.example.SubmissionForm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author HP
 *
 */
@Controller
public class FormController {
	@RequestMapping("/")
	public String formSubmission() {
		return "CustomerForm.jsp";

	}

}
