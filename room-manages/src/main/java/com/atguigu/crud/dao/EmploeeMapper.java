package com.atguigu.crud.dao;

import com.atguigu.crud.bean.Emploee;
import com.atguigu.crud.bean.EmploeeExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmploeeMapper {
    long countByExample(EmploeeExample example);

    int deleteByExample(EmploeeExample example);

    int deleteByPrimaryKey(Integer peo_employee_id);

    int insert(Emploee record);

    int insertSelective(Emploee record);

    List<Emploee> selectByExample(EmploeeExample example);

    Emploee selectByPrimaryKey(Integer peo_employee_id);

    List<Emploee> selectByExampleWithDept(EmploeeExample example);

    Emploee selectByPrimaryKeyWithDept(Integer peo_employee_id);

    int updateByExampleSelective(@Param("record") Emploee record, @Param("example") EmploeeExample example);

    int updateByExample(@Param("record") Emploee record, @Param("example") EmploeeExample example);

    int updateByPrimaryKeySelective(Emploee record);

    int updateByPrimaryKey(Emploee record);
    
    void insertUser(Emploee emploee);
    
    public Emploee selectByName(String peo_employee_name);
    
}