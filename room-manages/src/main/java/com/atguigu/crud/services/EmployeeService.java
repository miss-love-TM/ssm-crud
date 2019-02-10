package com.atguigu.crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.crud.bean.Emploee;
import com.atguigu.crud.dao.EmploeeMapper;
@Service
public class EmployeeService {
	
	@Autowired
	EmploeeMapper emploeeMapper;
	
	public List<Emploee> getAll(){
		return emploeeMapper.selectByExampleWithDept(null);
	}
	
	 public void setDao(EmploeeMapper emploeeMapper)
	 {
		 this.emploeeMapper=emploeeMapper;
	 }
	 public void saveUser(Emploee emploee)
	 {
		 emploeeMapper.insertUser(emploee);
	 }
	 
	 public boolean exist(String peo_employee_name) {
		 Emploee emploee = emploeeMapper.selectByName(peo_employee_name);
	 if(emploee!=null){
	 return true;
	 }
	 return false;
	 }
	
}
