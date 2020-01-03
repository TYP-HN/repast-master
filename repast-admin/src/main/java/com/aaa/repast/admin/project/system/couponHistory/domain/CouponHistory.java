package com.aaa.repast.admin.project.system.couponHistory.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.aaa.repast.admin.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 优惠券使用、领取历史表 sms_coupon_history
 * 
 * @author Seven Lee
 * @date 2020-01-02
 */
public class CouponHistory extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Long id;
	/**  */
	private Long shopId;
	/**  */
	private Long couponId;
	/**  */
	private Long memberId;
	/**  */
	private String couponCode;
	/** 领取人昵称 */
	private String memberNickname;
	/** 获取类型：0->后台赠送；1->主动获取 */
	private Integer getType;
	/**  */
	private Date createTime;
	/** 使用状态：0->未使用；1->已使用；2->已过期 */
	private Integer useStatus;
	/** 使用时间 */
	private Date useTime;
	/** 订单编号 */
	private Long orderId;
	/** 订单号码 */
	private String orderSn;

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
	public void setCouponId(Long couponId) 
	{
		this.couponId = couponId;
	}

	public Long getCouponId() 
	{
		return couponId;
	}
	public void setMemberId(Long memberId) 
	{
		this.memberId = memberId;
	}

	public Long getMemberId() 
	{
		return memberId;
	}
	public void setCouponCode(String couponCode) 
	{
		this.couponCode = couponCode;
	}

	public String getCouponCode() 
	{
		return couponCode;
	}
	public void setMemberNickname(String memberNickname) 
	{
		this.memberNickname = memberNickname;
	}

	public String getMemberNickname() 
	{
		return memberNickname;
	}
	public void setGetType(Integer getType) 
	{
		this.getType = getType;
	}

	public Integer getGetType() 
	{
		return getType;
	}
	public void setCreateTime(Date createTime) 
	{
		this.createTime = createTime;
	}

	public Date getCreateTime() 
	{
		return createTime;
	}
	public void setUseStatus(Integer useStatus) 
	{
		this.useStatus = useStatus;
	}

	public Integer getUseStatus() 
	{
		return useStatus;
	}
	public void setUseTime(Date useTime) 
	{
		this.useTime = useTime;
	}

	public Date getUseTime() 
	{
		return useTime;
	}
	public void setOrderId(Long orderId) 
	{
		this.orderId = orderId;
	}

	public Long getOrderId() 
	{
		return orderId;
	}
	public void setOrderSn(String orderSn) 
	{
		this.orderSn = orderSn;
	}

	public String getOrderSn() 
	{
		return orderSn;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("shopId", getShopId())
            .append("couponId", getCouponId())
            .append("memberId", getMemberId())
            .append("couponCode", getCouponCode())
            .append("memberNickname", getMemberNickname())
            .append("getType", getGetType())
            .append("createTime", getCreateTime())
            .append("useStatus", getUseStatus())
            .append("useTime", getUseTime())
            .append("orderId", getOrderId())
            .append("orderSn", getOrderSn())
            .toString();
    }
}
