package cn.skele.service.impl;

import cn.skele.mapper.IUserMapper;
import cn.skele.model.User;
import cn.skele.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * 事务在service层
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserMapper userDao;

	public User findUserById(int id) {
		return userDao.findUserById(id);
	}

}
