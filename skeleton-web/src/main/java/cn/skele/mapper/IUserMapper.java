package cn.skele.mapper;

import cn.skele.model.User;

public interface IUserMapper {

	/**
     * 查询用户
     * @param id
     * @return
     */
    public User findUserById(int id);
}
