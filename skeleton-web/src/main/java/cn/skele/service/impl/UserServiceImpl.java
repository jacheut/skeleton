package cn.skele.service.impl;

import cn.skele.mapper.UserMapper;
import cn.skele.model.po.User;
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
	private UserMapper userDao;

	public User findUserById(Long id) {
		return userDao.selectByPrimaryKey(id);
	}

}
