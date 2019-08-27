package com.ecfunds.www.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.ecfunds.www.base.BaseObject;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
@TableName("cf_project")
public class Project extends BaseObject {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String caption;

    private String description;

    private Integer applyCount;

    private Integer evaluateCount;

    /**
     * 状态 1 预热中 2 申请中 3 体验中 4 已结束
     */
    private Integer status;

    private Double marketPrice;

    private Double salePrice;

    private Integer likes;

    private Integer follow;

    private Integer category;

    private Double planAmount;

    private LocalDateTime endDate;

    private Double actualAmount;

    private LocalDateTime createDate;

    private String postUrl;

    private String initiatorId;


}
