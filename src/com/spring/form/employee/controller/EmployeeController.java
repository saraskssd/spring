package com.spring.form.employee.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	
	
	 List<EmployeeBean> list= new ArrayList<EmployeeBean>();  

	@RequestMapping("/employeeForm")
	public ModelAndView showform() {
		
		return new ModelAndView("employeeform", "command", new EmployeeBean());
	}

	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("emp") EmployeeBean employeeBean) {
		
		System.out.println(employeeBean.getEmployeeName() + " " + employeeBean.getEmployeeSalary() + " " + employeeBean.getEmployeeDesignation());
		list.add(new EmployeeBean(1,"rahul",35000f,"S.Engineer"));  
        list.add(new EmployeeBean(2,"aditya",25000f,"IT Manager"));  
        list.add(new EmployeeBean(3,"sachin",55000f,"Care Taker"));  
		list.add(employeeBean);
		
		return new ModelAndView("redirect:/viewEmployee.spring");
	}
	
	
	@RequestMapping("/viewEmployee")  
    public ModelAndView viewemp(){  
        
        
        System.out.println(list.size()); 
        list.add(new EmployeeBean());
        return new ModelAndView("viewemployee","employeeList",list);  
    }  
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView welcome() {
	  return new ModelAndView("index");
	 }
}