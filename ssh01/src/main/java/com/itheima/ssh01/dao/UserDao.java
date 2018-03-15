package com.itheima.ssh01.dao;

import com.itheima.ssh01.domain.User;

/**  
 * ClassName:UserDao <br/>  
 * Function:  <br/>  
 * Date:     2018年3月10日 下午5:27:15 <br/>       
 */
public interface UserDao {

	User findById(Integer id);
	
}
  
