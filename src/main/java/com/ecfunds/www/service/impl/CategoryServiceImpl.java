package com.ecfunds.www.service.impl;

import com.ecfunds.www.entity.Category;
import com.ecfunds.www.mapper.CategoryMapper;
import com.ecfunds.www.service.ICategoryService;
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
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

}
