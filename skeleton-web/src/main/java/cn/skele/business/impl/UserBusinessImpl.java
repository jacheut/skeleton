package cn.skele.business.impl;

import cn.skele.business.IUserBusiness;
import cn.skele.model.po.User;
import cn.skele.service.IUserService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserBusinessImpl implements IUserBusiness {
	
	@Resource
	private IUserService userService;
	
	public User getUserById(int id) {
		return userService.findUserById((long)id);
	}

}
