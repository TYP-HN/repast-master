package com.aaa.repast.admin.project.system.coupon.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.aaa.repast.admin.framework.web.domain.BaseEntity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 优惠卷表 sms_coupon
 * 
 * @author Seven Lee
 * @date 2019-12-30
 */
public class Coupon extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Long id;
	/**  */
	private Long shopId;
	/** 优惠卷类型；0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券 */
	private Integer type;
	/**  */
	private String name;
	/** 使用平台：0->全部；1->移动；2->PC */
	private Integer platform;
	/** 数量 */
	private Integer count;
	/** 金额 */
	private BigDecimal amount;
	/** 每人限领张数 */
	private Integer perLimit;
	/** 使用门槛；0表示无门槛 */
	private BigDecimal minPoint;
	/** 开始时间 */
	private Date startTime;
	/** 结束时间 */
	private Date endTime;
	/** 使用类型：0->全场通用；1->指定分类；2->指定商品 */
	private Integer useType;
	/** 备注 */
	private String note;
	/** 发行数量 */
	private Integer publishCount;
	/** 已使用数量 */
	private Integer useCount;
	/** 领取数量 */
	private Integer receiveCount;
	/** 可以领取的日期 */
	private Date enableTime;
	/** 优惠码 */
	private String code;
	/** 可领取的会员类型：0->无限时 */
	private Integer memberLevel;

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
	public void setType(Integer type) 
	{
		this.type = type;
	}

	public Integer getType() 
	{
		return type;
	}
	public void setName(String name) 
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	public void setPlatform(Integer platform) 
	{
		this.platform = platform;
	}

	public Integer getPlatform() 
	{
		return platform;
	}
	public void setCount(Integer count) 
	{
		this.count = count;
	}

	public Integer getCount() 
	{
		return count;
	}
	public void setAmount(BigDecimal amount) 
	{
		this.amount = amount;
	}

	public BigDecimal getAmount() 
	{
		return amount;
	}
	public void setPerLimit(Integer perLimit) 
	{
		this.perLimit = perLimit;
	}

	public Integer getPerLimit() 
	{
		return perLimit;
	}
	public void setMinPoint(BigDecimal minPoint) 
	{
		this.minPoint = minPoint;
	}

	public BigDecimal getMinPoint() 
	{
		return minPoint;
	}
	public void setStartTime(Date startTime) 
	{
		this.startTime = startTime;
	}

	public Date getStartTime() 
	{
		return startTime;
	}
	public void setEndTime(Date endTime) 
	{
		this.endTime = endTime;
	}

	public Date getEndTime() 
	{
		return endTime;
	}
	public void setUseType(Integer useType) 
	{
		this.useType = useType;
	}

	public Integer getUseType() 
	{
		return useType;
	}
	public void setNote(String note) 
	{
		this.note = note;
	}

	public String getNote() 
	{
		return note;
	}
	public void setPublishCount(Integer publishCount) 
	{
		this.publishCount = publishCount;
	}

	public Integer getPublishCount() 
	{
		return publishCount;
	}
	public void setUseCount(Integer useCount) 
	{
		this.useCount = useCount;
	}

	public Integer getUseCount() 
	{
		return useCount;
	}
	public void setReceiveCount(Integer receiveCount) 
	{
		this.receiveCount = receiveCount;
	}

	public Integer getReceiveCount() 
	{
		return receiveCount;
	}
	public void setEnableTime(Date enableTime) 
	{
		this.enableTime = enableTime;
	}

	public Date getEnableTime() 
	{
		return enableTime;
	}
	public void setCode(String code) 
	{
		this.code = code;
	}

	public String getCode() 
	{
		return code;
	}
	public void setMemberLevel(Integer memberLevel) 
	{
		this.memberLevel = memberLevel;
	}

	public Integer getMemberLevel() 
	{
		return memberLevel;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("shopId", getShopId())
            .append("type", getType())
            .append("name", getName())
            .append("platform", getPlatform())
            .append("count", getCount())
            .append("amount", getAmount())
            .append("perLimit", getPerLimit())
            .append("minPoint", getMinPoint())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("useType", getUseType())
            .append("note", getNote())
            .append("publishCount", getPublishCount())
            .append("useCount", getUseCount())
            .append("receiveCount", getReceiveCount())
            .append("enableTime", getEnableTime())
            .append("code", getCode())
            .append("memberLevel", getMemberLevel())
            .toString();
    }
}
