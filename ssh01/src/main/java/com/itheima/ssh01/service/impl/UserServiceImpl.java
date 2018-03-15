package com.itheima.ssh01.service.impl;

import org.omg.CORBA.PRIVATE_MEMBER;

import com.itheima.ssh01.dao.UserDao;
import com.itheima.ssh01.domain.User;
import com.itheima.ssh01.service.UserService;

/**  
 * ClassName:UserServiceImpl <br/>  
 * Function:  <br/>  
 * Date:     2018年3月10日 下午5:30:00 <br/>       
 */
public class UserServiceImpl implements UserService {

	private UserDao userdao;
	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}
	
	@Override
	public User findById(Integer id) {
		  
	
		return userdao.findById(id);
	}

	

}
  
