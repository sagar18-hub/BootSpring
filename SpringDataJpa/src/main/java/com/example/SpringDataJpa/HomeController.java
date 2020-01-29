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
		System.out.println("The is Demo");
		return "home.jsp";
	}

}
