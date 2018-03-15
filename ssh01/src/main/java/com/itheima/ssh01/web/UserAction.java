package com.itheima.ssh01.web;

import com.itheima.ssh01.domain.User;
import com.itheima.ssh01.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**  
 * ClassName:UserAction <br/>  
 * Function:  <br/>  
 * Date:     2018年3月10日 下午5:31:13 <br/>       
 */
public class UserAction extends ActionSupport implements ModelDriven<User> {

	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	private User user = new User();
	@Override
	public User getModel() {	  
		return user;
	}
	
	private Integer id;
	public void setId(Integer id) {
		this.id = id;
	}
	
	public  String  findById(){
		
		user=userService.findById(id);
		return SUCCESS;
	}
	

}
  
