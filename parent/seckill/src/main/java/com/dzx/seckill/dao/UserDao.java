package com.dzx.seckill.dao;

import com.dzx.seckill.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author dengzhenxiang
 * @Date 2018/10/30 16:07
 * @Version
 * UserDao
 */
@Mapper
public interface UserDao {
	User selectUserById(Integer userId);
}
