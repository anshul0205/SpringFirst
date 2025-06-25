package com.cdac.Springfirst.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cdac.Springfirst.Bean.Student;
import com.cdac.Springfirst.service.StudentService;

import jakarta.servlet.http.HttpServletRequest;
@Controller
public class StudentController {
	@Autowired
	StudentService studentservice;     
	@RequestMapping("/form")
	public String getform()
	{
		return "registration";
	}
	/*
	@PostMapping("/register")
	public String getregister(HttpServletRequest request, Model m)
	{	int id= Integer.parseInt(request.getParameter("id"));
		String name= request.getParameter("name");
		String address= request.getParameter("address");
		String course= request.getParameter("course");
		
		Student s = new Student(id,name,address,course);
		m.addAttribute("stu",s);
		return "success";
	}
	
	
	@PostMapping("/register1")
	public String getregister1(@RequestParam int id, @RequestParam String name,@RequestParam String address,@RequestParam String course,Model m)
	{	Student s = new Student(id,name,address,course);
		m.addAttribute("stu",s);
		return "success";
	}
	*/

	
	@PostMapping("/register2")
	public String getregister2(@ModelAttribute Student student,
			Model m)
	{
		Student s=studentservice.save(student);
		m.addAttribute("stu", s);
		return "success";
	}
	@RequestMapping("/studetails")
	public ModelAndView getdetails()
	{
		/*
		 * ModelAndView mv=new ModelAndView(); mv.addObject("stulist",
		 * studentService.findAll()); mv.setViewName("studentlist"); return mv;
		 */
		return new ModelAndView("studentlist","stulist",studentservice.findAll());
	}
	@RequestMapping("/delitem/{id}")
	public String delletemap(@PathVariable("id") Integer id)
	{
		
		studentservice.delete(id);
		
		return "redirect:/studetails";
	}
	
	  @RequestMapping("/searchitem/{id}") 
	  public ModelAndView  editstudent(@PathVariable("id") Integer id) 
	  { 
		  
	  return new ModelAndView("editstudent","student",studentservice.findById(id)); 
	  }
	 
	  @RequestMapping("/updatestudent")
	  public String getupdate(@ModelAttribute Student student)
	  {
		  studentservice.update(student);
		  return "redirect:/studetails";
	  }
	  
}
