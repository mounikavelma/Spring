package com.spring.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.DAO.Student;

@Controller
public class StudentInfoController {
	
	@RequestMapping(value="/studentInfo", method=RequestMethod.GET)
	public ModelAndView getStudentDtls()
	{
		ModelAndView model=new ModelAndView("StudentDetails");
		model.addObject("msg", "please provide your details for admission");
		return model;
	}
	
	@InitBinder
	public void Databinder(WebDataBinder binder)
	{
		SimpleDateFormat format= new SimpleDateFormat("MM*DD*YYYY");
		binder.registerCustomEditor(Date.class, "submissionDate", new CustomDateEditor(format, false));
		binder.registerCustomEditor(String.class, "city", new ClassNameEditor());
	}
	
	/*@RequestMapping(value="/enrollmentStatus", method=RequestMethod.POST)
	public ModelAndView enrollementStatus()
	{
		ModelAndView model=new ModelAndView("StudentEnrollment");
		model.addObject("msg", "this is from StudentInfoController EnrollmentStatus");
		return model;
	}
	*/
	@RequestMapping(value="/enrollmentStatus", method=RequestMethod.POST)
	public ModelAndView enrollementStatusByModelAttribute(@Valid @ModelAttribute(name="student1") Student student, BindingResult result)
	{
		if(result.hasErrors())
		{
			ModelAndView model=new ModelAndView("StudentDetails");
			return model;
		}
		ModelAndView model=new ModelAndView("StudentEnrollment");
		model.addObject("msg", "this is from StudentInfoController EnrollmentStatus");
		return model;
	}
	@RequestMapping(value="/enrollmentStatus/{user}/{location}", method=RequestMethod.GET)
	public ModelAndView enrollementStatusByRequestParam(@PathVariable(name="user") String name,@PathVariable(name="location") String loc)
	{
		ModelAndView model=new ModelAndView("StudentEnrollment");
		model.addObject("msg"," enrollment success for "+ name+" and your location is "+loc);
		return model;
	}


}
