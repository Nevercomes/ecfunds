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
@TableName("cf_user_order")
public class UserOrder extends BaseObject {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String userId;

    private Integer goodsId;

    private LocalDateTime createTime;

    private Integer count;

    private Double payPrice;

    private Integer ifUseCoupon;

    private Integer couponId;


}
