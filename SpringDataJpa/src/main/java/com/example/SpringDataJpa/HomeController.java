/**
 * 
 */
package com.example.SpringDataJpa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author adms.java1
 *
 */
@Controller
public class HomeController {
	
	@RequestMapping("/getDetails")
	public String home(){
		return "home.jsp";
	}

}
