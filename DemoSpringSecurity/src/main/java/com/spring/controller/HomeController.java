/**
 * 
 */
package com.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HP
 *
 */
@RestController
public class HomeController {

	@RequestMapping(value="/")
	public String home()
	{
		return "home.jsp";

	}

}
