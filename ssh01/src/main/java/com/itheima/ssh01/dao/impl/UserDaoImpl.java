package com.itheima.ssh01.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.itheima.ssh01.dao.UserDao;
import com.itheima.ssh01.domain.User;

/**  
 * ClassName:UserDaoImpl <br/>  
 * Function:  <br/>  
 * Date:     2018年3月10日 下午5:28:06 <br/>       
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	@Override
	public User findById(Integer id) {
		  
		
		return getHibernateTemplate().get(User.class, id);
	}

}
  
