package com.aaa.repast.admin.project.system.integrationGrantSetting.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.aaa.repast.admin.framework.web.domain.BaseEntity;

/**
 * 积分发放设置表 ums_integration_grant_setting
 * 
 * @author Seven Lee
 * @date 2020-01-02
 */
public class IntegrationGrantSetting extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Long id;
	/**  */
	private Long shopId;
	/** 每一元需要抵扣的积分数量 */
	private Integer deductionPerAmount;

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
	public void setDeductionPerAmount(Integer deductionPerAmount) 
	{
		this.deductionPerAmount = deductionPerAmount;
	}

	public Integer getDeductionPerAmount() 
	{
		return deductionPerAmount;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("shopId", getShopId())
            .append("deductionPerAmount", getDeductionPerAmount())
            .toString();
    }
}
