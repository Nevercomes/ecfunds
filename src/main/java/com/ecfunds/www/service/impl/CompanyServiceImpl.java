package com.ecfunds.www.service.impl;

import com.ecfunds.www.entity.Company;
import com.ecfunds.www.mapper.CompanyMapper;
import com.ecfunds.www.service.ICompanyService;
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
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, Company> implements ICompanyService {

}
