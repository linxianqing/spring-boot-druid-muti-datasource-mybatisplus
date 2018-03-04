package org.lin.example.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.lin.example.entity.User;
import org.lin.example.mapper.UserMapper;
import org.lin.example.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author K神带你飞
 * @since 2018-03-03
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
	
}
