package com.atguigu.crud.bean;

public class Emploee {
	private Integer peo_employee_id;
    private String peo_employee_name;
    private String peo_password;
    private Integer peo_phone;
    private String peo_post;
    private String peo_email;
    private String peo_other;
    private String peo_address;
    // 构造函数
    public Emploee() {
        super();
    }

    public Emploee(Integer peo_employee_id, String peo_employee_name, String peo_password,Integer peo_phone,String peo_post,String peo_email,String peo_address,String peo_other) {
        super();
        this.peo_employee_id = peo_employee_id;
        this.peo_employee_name = peo_employee_name;
        this.peo_password = peo_password;
        this.peo_phone = peo_phone; 
        this.peo_post = peo_post;
        this.peo_address =peo_address;
        this.peo_email = peo_email;
        this.peo_other = peo_other;
    }

    // 成员方法
    public Integer getEmployee_id() {
        return peo_employee_id;
    }

    public void setEmployee_id(Integer peo_employee_id) {
        this.peo_employee_id = peo_employee_id;
    }

    public void setPhone(Integer peo_phone) {
        this.peo_phone = peo_phone;
    } 
    
    public Integer getPhone() {
        return peo_phone;
    }
    
    public void setAddress(String peo_address) {
        this.peo_address = peo_address;
    } 
    
    public String getAddress() {
        return peo_address;
    }
    
    public void setPost(String peo_post) {
        this.peo_post = peo_post;
    }
    
    public String getPost() {
        return peo_post;
    }
    
    public void setEmail(String peo_email) {
        this.peo_email = peo_email;
    }
    
    public String getEmail() {
        return peo_email;
    }
    
    public void setOther(String peo_other) {
        this.peo_other = peo_other;
    }
  
    public String getOther() {
        return peo_other;
    }
    
    public void setEmployee_name(String peo_employee_name) {
        this.peo_employee_name = peo_employee_name;
    } 
    
    public String getEmployee_name() {
        return peo_employee_name;
    }

    public String getPassword() {
        return peo_password;
    }

    public void setPassword(String peo_password) {
        this.peo_password = peo_password;
    }
}