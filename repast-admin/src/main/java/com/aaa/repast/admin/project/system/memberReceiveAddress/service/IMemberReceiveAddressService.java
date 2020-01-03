package com.aaa.repast.admin.project.system.memberReceiveAddress.service;

import com.aaa.repast.admin.project.system.memberReceiveAddress.domain.MemberReceiveAddress;
import java.util.List;

/**
 * 会员收货地址 服务层
 * 
 * @author Seven Lee
 * @date 2019-12-30
 */
public interface IMemberReceiveAddressService 
{
	/**
     * 查询会员收货地址信息
     * 
     * @param id 会员收货地址ID
     * @return 会员收货地址信息
     */
	public MemberReceiveAddress selectMemberReceiveAddressById(Long id);
	
	/**
     * 查询会员收货地址列表
     * 
     * @param memberReceiveAddress 会员收货地址信息
     * @return 会员收货地址集合
     */
	public List<MemberReceiveAddress> selectMemberReceiveAddressList(MemberReceiveAddress memberReceiveAddress);
	
	/**
     * 新增会员收货地址
     * 
     * @param memberReceiveAddress 会员收货地址信息
     * @return 结果
     */
	public int insertMemberReceiveAddress(MemberReceiveAddress memberReceiveAddress);
	
	/**
     * 修改会员收货地址
     * 
     * @param memberReceiveAddress 会员收货地址信息
     * @return 结果
     */
	public int updateMemberReceiveAddress(MemberReceiveAddress memberReceiveAddress);
		
	/**
     * 删除会员收货地址信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteMemberReceiveAddressByIds(String ids);
	
}
