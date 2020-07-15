package com.elife.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.elife.entity.User;
import com.elife.mapper.UserMapper;
import com.elife.service.UserService;

import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 小混蛋
 * @since 2018-08-22
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
