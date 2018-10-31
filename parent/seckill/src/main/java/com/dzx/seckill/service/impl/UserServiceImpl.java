package com.dzx.seckill.service.impl;

import com.dzx.seckill.dao.UserDao;
import com.dzx.seckill.entity.User;
import com.dzx.seckill.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @author dengzhenxiang
 * @Date 2018/10/30 16:08
 * @Version
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public User selectUserById(Integer userId) {
		return userDao.selectUserById(userId);
	}
}
