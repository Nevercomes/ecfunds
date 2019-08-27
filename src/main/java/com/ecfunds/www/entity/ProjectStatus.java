package com.ecfunds.www.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ecfunds.www.base.BaseObject;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author louyy
 * @since 2019-08-27
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("cf_project_status")
public class ProjectStatus extends BaseObject {

    private static final long serialVersionUID=1L;

    private Integer id;

    private String description;


}
