package com.example.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Addition {

	@RequestMapping("/")
	public String h() {
		return "home";
	}

	// @RequestMapping("/add")
//1	public String ad(HttpServletRequest req) {
//1		int i=Integer.parseInt(req.getParameter("N1"));
//1		int j=Integer.parseInt(req.getParameter("N2"));
//1		int k=i+j;
//1		HttpSession session=req.getSession();
//1		session.setAttribute("result", k);
//1		return "result.jsp";
//1	}

//2	public String ad(@RequestParam("N1") int i,@RequestParam("N2") int j, HttpSession s) {
//2			int k=i+j;
//2			s.setAttribute("result", k);
//2	      	return "result.jsp";
//2	}

//3	public ModelAndView ad(@RequestParam("N1") int i,@RequestParam("N2") int j, HttpSession s) {
//3	ModelAndView mv=new ModelAndView();
//3	mv.setViewName("result.jsp");
//3	int k=i+j;
//3	mv.addObject("result", k); //model object
//3	return mv;
//3	}

	// 4 removed .jsp extension and added views folder and gave prefix and suffix
	// properties
	// in application.properties folder prefix=views(folder name)
	// suffix=.jsp(extension of file under folder).
//4	public ModelAndView ad(@RequestParam("N1") int i, @RequestParam("N2") int j) {
//4		ModelAndView mv = new ModelAndView();
//4		mv.setViewName("result");
//4		int k = i + j;
//4		mv.addObject("result", k);
//4		return mv;
//4	}

	// 5using Model attribute to add and we can even use modelmap for storing map
	// key value.
//5	public String ad(@RequestParam("N1") int i, @RequestParam("N2") int j,Model m) {
//5	int k=i+j;
//5	m.addAttribute("result",k);
//5	return "result";
//5	}

	//6 Retriving employee details for whicha new jsp page empjsp created and Employee model
    //is passed directly. Model is just an convention you can use like in 5 or ignore 
	@RequestMapping("/adddetails")
	public String adddetails(Employee e) {
		return "empjsp";
	}

}
