package com.atguigu.crud.test;

import java.util.UUID;

import org.apache.ibatis.session.SqlSession;
import org.aspectj.apache.bcel.util.ClassPath;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.atguigu.crud.bean.Department;
import com.atguigu.crud.bean.Emploee;
import com.atguigu.crud.dao.DepartmentMapper;
/*
 * dao灞傛祴璇�
 * spring椤圭洰浣跨敤spring鍗曞厓娴嬭瘯		鍙互鑷姩娉ㄥ叆鎴戜滑闇�瑕佺殑缁勪欢
 * 1銆丂ContextConfiguration鎸囧畾spring閰嶇疆鏂囦欢浣嶇疆
 * 2銆乺unwith	junit鐨勬敞瑙ｏ紝杩愯鏃舵寚鏄庝娇鐢ㄩ偅涓崟鍏冩ā鍧楁祴璇�	
 * 			SpringJUnit4ClassRunner	spring鐨勫崟鍏冩ā鍧�
 * 3銆佺洿鎺utowired鑷姩娉ㄥ叆缁勪欢
 */
import com.atguigu.crud.dao.EmploeeMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class MapperTest {
	@Autowired
	EmploeeMapper emploeeMapper;
	@Autowired
	SqlSession sqlSession;

	@Test
	public void testCRUD() {
		// 鍘熺敓
		/*
		 * // 1銆佸垱寤簊pringIOC瀹瑰櫒 ApplicationContext applicationContext = new
		 * ClassPathXmlApplicationContext("applicationContext.xml"); // 2銆佷粠瀹瑰櫒涓幏鍙杕apper
		 * DepartmentMapper departmentMapper
		 * =applicationContext.getBean(DepartmentMapper.class);
		 */

		// 娴嬭瘯
		/*
		 * departmentMapper.insert(new Department(null,"寮�鍙戦儴"));
		 * departmentMapper.insert(new Department(null,"娴嬭瘯閮�"));
		 */

		// 鎵归噺
		EmploeeMapper mapper = sqlSession.getMapper(EmploeeMapper.class);
		for (int i = 0; i < 10; i++) {
			String name=UUID.randomUUID().toString().substring(0, 5)+i;
			mapper.insert(new Emploee(null, "dada", "M", name+"@guigu.com", 2));
		}
		System.out.println("绌哄彛鍙ｅ彛鍙ｏ細"+
				emploeeMapper.selectByPrimaryKeyWithDept(1000).getEmpName());
	}
}
