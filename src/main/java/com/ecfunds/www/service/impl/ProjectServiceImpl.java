package com.ecfunds.www.service.impl;

import com.ecfunds.www.entity.Project;
import com.ecfunds.www.mapper.ProjectMapper;
import com.ecfunds.www.service.IProjectService;
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
public class ProjectServiceImpl extends ServiceImpl<ProjectMapper, Project> implements IProjectService {

}
