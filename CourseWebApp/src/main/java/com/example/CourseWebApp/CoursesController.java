/**
 * 
 */
package com.example.CourseWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author HP
 *
 */
@Controller
public class CoursesController {

	/*	*//**
			 * @param args
			 *//*
				 * public static void main(String[] args) { // TODO Auto-generated method stub
				 * 
				 * }
				 */
	@RequestMapping("/courses")
	public String courses() {
		System.out.println("Swami Samarth");
		return "courses.jsp";

	}
}
