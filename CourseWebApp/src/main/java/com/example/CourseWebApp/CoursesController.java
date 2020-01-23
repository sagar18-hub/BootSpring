/**
 * 
 */
package com.example.CourseWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author HP
 *
 */
@Controller
public class CoursesController {

	@RequestMapping("/courses")
	public ModelAndView courses(@RequestParam("cname") String coursename) {
		/*
		 * HttpSession session = req.getSession(); String cname =
		 * req.getParameter("cname");
		 */
		System.out.println("the courses is completed" + coursename);
		System.out.println("Swami Samarth");
		// session.setAttribute("cname", coursename);
		ModelAndView mv = new ModelAndView();
		mv.addObject("cname", coursename);
		mv.setViewName("courses.jsp");
		return mv;

	}
}
