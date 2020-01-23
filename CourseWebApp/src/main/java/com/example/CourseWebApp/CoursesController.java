/**
 * 
 */
package com.example.CourseWebApp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author HP
 *
 */
@Controller
public class CoursesController {

	@RequestMapping("/courses")
	public String courses(HttpServletRequest req) {
		HttpSession session = req.getSession();
		String cname = req.getParameter("cname");
		System.out.println("the courses is completed" + cname);
		System.out.println("Swami Samarth");
		session.setAttribute("cname", cname);
		return "courses.jsp";

	}
}
