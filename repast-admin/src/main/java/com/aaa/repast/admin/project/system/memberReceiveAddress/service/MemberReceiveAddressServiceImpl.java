package com.aaa.repast.admin.project.system.memberReceiveAddress.service;

import com.aaa.repast.common.support.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.aaa.repast.admin.project.system.memberReceiveAddress.mapper.MemberReceiveAddressMapper;
import com.aaa.repast.admin.project.system.memberReceiveAddress.domain.MemberReceiveAddress;

/**
 * 会员收货地址 服务层实现
 * 
 * @author Seven Lee
 * @date 2019-12-30
 */
@Service
public class MemberReceiveAddressServiceImpl implements IMemberReceiveAddressService 
{
	@Autowired
	private MemberReceiveAddressMapper memberReceiveAddressMapper;

	/**
     * 查询会员收货地址信息
     * 
     * @param id 会员收货地址ID
     * @return 会员收货地址信息
     */
    @Override
	public MemberReceiveAddress selectMemberReceiveAddressById(Long id)
	{
	    return memberReceiveAddressMapper.selectMemberReceiveAddressById(id);
	}
	
	/**
     * 查询会员收货地址列表
     * 
     * @param memberReceiveAddress 会员收货地址信息
     * @return 会员收货地址集合
     */
	@Override
	public List<MemberReceiveAddress> selectMemberReceiveAddressList(MemberReceiveAddress memberReceiveAddress)
	{
	    return memberReceiveAddressMapper.selectMemberReceiveAddressList(memberReceiveAddress);
	}
	
    /**
     * 新增会员收货地址
     * 
     * @param memberReceiveAddress 会员收货地址信息
     * @return 结果
     */
	@Override
	public int insertMemberReceiveAddress(MemberReceiveAddress memberReceiveAddress)
	{
	    return memberReceiveAddressMapper.insertMemberReceiveAddress(memberReceiveAddress);
	}
	
	/**
     * 修改会员收货地址
     * 
     * @param memberReceiveAddress 会员收货地址信息
     * @return 结果
     */
	@Override
	public int updateMemberReceiveAddress(MemberReceiveAddress memberReceiveAddress)
	{
	    return memberReceiveAddressMapper.updateMemberReceiveAddress(memberReceiveAddress);
	}

	/**
     * 删除会员收货地址对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteMemberReceiveAddressByIds(String ids)
	{
		return memberReceiveAddressMapper.deleteMemberReceiveAddressByIds(Convert.toStrArray(ids));
	}
	
}
