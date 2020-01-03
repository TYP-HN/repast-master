package com.aaa.repast.admin.project.system.memberRuleSetting.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.aaa.repast.admin.framework.web.domain.BaseEntity;

import java.math.BigDecimal;

/**
 * 会员积分成长规则表 ums_member_rule_setting
 * 
 * @author Seven Lee
 * @date 2020-01-02
 */
public class MemberRuleSetting extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Long id;
	/**  */
	private Long shopId;
	/** 连续签到天数 */
	private Integer continueSignDay;
	/** 连续签到赠送数量 */
	private Integer continueSignPoint;
	/** 每消费多少元获取1个点 */
	private BigDecimal consumePerPoint;
	/** 最低获取点数的订单金额 */
	private BigDecimal lowOrderAmount;
	/** 每笔订单最高获取点数 */
	private Integer maxPointPerOrder;
	/** 类型：0->积分规则；1->成长值规则 */
	private Integer type;

	public void setId(Long id) 
	{
		this.id = id;
	}

	public Long getId() 
	{
		return id;
	}
	public void setShopId(Long shopId) 
	{
		this.shopId = shopId;
	}

	public Long getShopId() 
	{
		return shopId;
	}
	public void setContinueSignDay(Integer continueSignDay) 
	{
		this.continueSignDay = continueSignDay;
	}

	public Integer getContinueSignDay() 
	{
		return continueSignDay;
	}
	public void setContinueSignPoint(Integer continueSignPoint) 
	{
		this.continueSignPoint = continueSignPoint;
	}

	public Integer getContinueSignPoint() 
	{
		return continueSignPoint;
	}
	public void setConsumePerPoint(BigDecimal consumePerPoint) 
	{
		this.consumePerPoint = consumePerPoint;
	}

	public BigDecimal getConsumePerPoint() 
	{
		return consumePerPoint;
	}
	public void setLowOrderAmount(BigDecimal lowOrderAmount) 
	{
		this.lowOrderAmount = lowOrderAmount;
	}

	public BigDecimal getLowOrderAmount() 
	{
		return lowOrderAmount;
	}
	public void setMaxPointPerOrder(Integer maxPointPerOrder) 
	{
		this.maxPointPerOrder = maxPointPerOrder;
	}

	public Integer getMaxPointPerOrder() 
	{
		return maxPointPerOrder;
	}
	public void setType(Integer type) 
	{
		this.type = type;
	}

	public Integer getType() 
	{
		return type;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("shopId", getShopId())
            .append("continueSignDay", getContinueSignDay())
            .append("continueSignPoint", getContinueSignPoint())
            .append("consumePerPoint", getConsumePerPoint())
            .append("lowOrderAmount", getLowOrderAmount())
            .append("maxPointPerOrder", getMaxPointPerOrder())
            .append("type", getType())
            .toString();
    }
}
