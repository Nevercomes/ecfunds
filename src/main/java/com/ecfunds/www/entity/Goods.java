package com.ecfunds.www.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.ecfunds.www.base.BaseObject;
import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("cf_goods")
public class Goods extends BaseObject {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    /**
     * 限额
     */
    private Integer quota;

    /**
     * 剩余
     */
    private Integer remain;

    private String description;

    private Double sendPrice;

    /**
     * 预计回报发送时间
     */
    private Integer sendDays;

    /**
     * 支持者
     */
    private Integer supporter;

    private Double price;

    private Integer projectId;


}
