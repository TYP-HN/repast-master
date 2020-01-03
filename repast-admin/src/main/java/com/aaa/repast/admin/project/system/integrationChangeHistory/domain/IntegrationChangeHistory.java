package com.aaa.repast.admin.project.system.integrationChangeHistory.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.aaa.repast.admin.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 积分变化历史记录表 ums_integration_change_history
 * 
 * @author Seven Lee
 * @date 2020-01-02
 */
public class IntegrationChangeHistory extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Long id;
	/** 会员ID */
	private Long memberId;
	/** 店铺ID */
	private Long shopId;
	/** 创建记录时间 */
	private Date createTime;
	/** 积分变化类型 1. 外卖下单获取积分，2.食堂下单获取积分，3. 管理员修改 ，4. 积分兑换消耗积分 */
	private Integer changeType;
	/** 积分改变数量 */
	private Integer changeCount;
	/** 操作人员 */
	private String operateMan;
	/** 操作备注 */
	private String operateNote;
	/** 积分来源：0->购物奖励；1->管理员修改；2->购物消费 */
	private Integer sourceType;

	public void setId(Long id) 
	{
		this.id = id;
	}

	public Long getId() 
	{
		return id;
	}
	public void setMemberId(Long memberId) 
	{
		this.memberId = memberId;
	}

	public Long getMemberId() 
	{
		return memberId;
	}
	public void setShopId(Long shopId) 
	{
		this.shopId = shopId;
	}

	public Long getShopId() 
	{
		return shopId;
	}
	public void setCreateTime(Date createTime) 
	{
		this.createTime = createTime;
	}

	public Date getCreateTime() 
	{
		return createTime;
	}
	public void setChangeType(Integer changeType) 
	{
		this.changeType = changeType;
	}

	public Integer getChangeType() 
	{
		return changeType;
	}
	public void setChangeCount(Integer changeCount) 
	{
		this.changeCount = changeCount;
	}

	public Integer getChangeCount() 
	{
		return changeCount;
	}
	public void setOperateMan(String operateMan) 
	{
		this.operateMan = operateMan;
	}

	public String getOperateMan() 
	{
		return operateMan;
	}
	public void setOperateNote(String operateNote) 
	{
		this.operateNote = operateNote;
	}

	public String getOperateNote() 
	{
		return operateNote;
	}
	public void setSourceType(Integer sourceType) 
	{
		this.sourceType = sourceType;
	}

	public Integer getSourceType() 
	{
		return sourceType;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("memberId", getMemberId())
            .append("shopId", getShopId())
            .append("createTime", getCreateTime())
            .append("changeType", getChangeType())
            .append("changeCount", getChangeCount())
            .append("operateMan", getOperateMan())
            .append("operateNote", getOperateNote())
            .append("sourceType", getSourceType())
            .toString();
    }
}
