package com.ecfunds.www.service.impl;

import com.ecfunds.www.entity.UserOrder;
import com.ecfunds.www.mapper.UserOrderMapper;
import com.ecfunds.www.service.IUserOrderService;
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
public class UserOrderServiceImpl extends ServiceImpl<UserOrderMapper, UserOrder> implements IUserOrderService {

}
