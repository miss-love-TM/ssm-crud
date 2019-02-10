package com.atguigu.crud.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.atguigu.crud.bean.Emploee;
import com.atguigu.crud.bean.Msg;
import com.atguigu.crud.services.EmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
/*
 * 閸涙ê浼恈rud鐠囬攱鐪�
 */
@Controller
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	public void setService(EmployeeService employeeService)
	{
		this.employeeService=employeeService;
	}		
    @RequestMapping("/user/regist")
    @ResponseBody
    public ModelAndView test01(HttpServletRequest request)
    {
    	String peo_employee_name=request.getParameter("peo_employee_name");
        
    	String peo_password=request.getParameter("peo_password");
        
        String peo_employee_id1=request.getParameter("peo_employee_id");
        Integer peo_employee_id=Integer.valueOf(peo_employee_id1);
        
        String peo_phone1=request.getParameter("peo_phone");
        Integer peo_phone=Integer.valueOf(peo_phone1);
        
        String peo_post=request.getParameter("peo_post");
        
        String peo_address=request.getParameter("peo_address");
        
        String peo_email=request.getParameter("peo_email");
        
        String peo_other=request.getParameter("peo_other");
        
        Emploee emploee=new Emploee(peo_employee_id, peo_employee_name, peo_password,peo_phone,peo_post, peo_email,peo_address, peo_other);
        employeeService.saveUser(emploee);
        ModelAndView mv=new ModelAndView();
        mv.setViewName("success");
        return mv;
    }    
	
}
