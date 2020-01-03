package com.aaa.repast.admin.project.system.memberReceiveAddress.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.aaa.repast.admin.framework.web.domain.BaseEntity;

/**
 * 会员收货地址表 ums_member_receive_address
 * 
 * @author Seven Lee
 * @date 2019-12-30
 */
public class MemberReceiveAddress extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Long id;
	/**  */
	private Long memberId;
	/** 收货人名称 */
	private String name;
	/**  */
	private String phoneNumber;
	/** 是否为默认 */
	private Integer defaultStatus;
	/** 邮政编码 */
	private String postCode;
	/** 省份/直辖市 */
	private String province;
	/** 城市 */
	private String city;
	/** 区 */
	private String region;
	/** 详细地址(街道) */
	private String detailAddress;

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
	public void setName(String name) 
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	public void setPhoneNumber(String phoneNumber) 
	{
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() 
	{
		return phoneNumber;
	}
	public void setDefaultStatus(Integer defaultStatus) 
	{
		this.defaultStatus = defaultStatus;
	}

	public Integer getDefaultStatus() 
	{
		return defaultStatus;
	}
	public void setPostCode(String postCode) 
	{
		this.postCode = postCode;
	}

	public String getPostCode() 
	{
		return postCode;
	}
	public void setProvince(String province) 
	{
		this.province = province;
	}

	public String getProvince() 
	{
		return province;
	}
	public void setCity(String city) 
	{
		this.city = city;
	}

	public String getCity() 
	{
		return city;
	}
	public void setRegion(String region) 
	{
		this.region = region;
	}

	public String getRegion() 
	{
		return region;
	}
	public void setDetailAddress(String detailAddress) 
	{
		this.detailAddress = detailAddress;
	}

	public String getDetailAddress() 
	{
		return detailAddress;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("memberId", getMemberId())
            .append("name", getName())
            .append("phoneNumber", getPhoneNumber())
            .append("defaultStatus", getDefaultStatus())
            .append("postCode", getPostCode())
            .append("province", getProvince())
            .append("city", getCity())
            .append("region", getRegion())
            .append("detailAddress", getDetailAddress())
            .toString();
    }
}
