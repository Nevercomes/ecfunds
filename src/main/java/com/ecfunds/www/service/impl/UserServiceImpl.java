package com.ecfunds.www.service.impl;

import com.ecfunds.www.entity.User;
import com.ecfunds.www.mapper.UserMapper;
import com.ecfunds.www.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author louyy
 * @since 2019-08-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
