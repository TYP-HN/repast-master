package com.aaa.repast.admin.project.system.memberRuleSetting.service;

import com.aaa.repast.common.support.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.aaa.repast.admin.project.system.memberRuleSetting.mapper.MemberRuleSettingMapper;
import com.aaa.repast.admin.project.system.memberRuleSetting.domain.MemberRuleSetting;

/**
 * 会员积分成长规则 服务层实现
 * 
 * @author Seven Lee
 * @date 2020-01-02
 */
@Service
public class MemberRuleSettingServiceImpl implements IMemberRuleSettingService 
{
	@Autowired
	private MemberRuleSettingMapper memberRuleSettingMapper;

	/**
     * 查询会员积分成长规则信息
     * 
     * @param id 会员积分成长规则ID
     * @return 会员积分成长规则信息
     */
    @Override
	public MemberRuleSetting selectMemberRuleSettingById(Long id)
	{
	    return memberRuleSettingMapper.selectMemberRuleSettingById(id);
	}
	
	/**
     * 查询会员积分成长规则列表
     * 
     * @param memberRuleSetting 会员积分成长规则信息
     * @return 会员积分成长规则集合
     */
	@Override
	public List<MemberRuleSetting> selectMemberRuleSettingList(MemberRuleSetting memberRuleSetting)
	{
	    return memberRuleSettingMapper.selectMemberRuleSettingList(memberRuleSetting);
	}
	
    /**
     * 新增会员积分成长规则
     * 
     * @param memberRuleSetting 会员积分成长规则信息
     * @return 结果
     */
	@Override
	public int insertMemberRuleSetting(MemberRuleSetting memberRuleSetting)
	{
	    return memberRuleSettingMapper.insertMemberRuleSetting(memberRuleSetting);
	}
	
	/**
     * 修改会员积分成长规则
     * 
     * @param memberRuleSetting 会员积分成长规则信息
     * @return 结果
     */
	@Override
	public int updateMemberRuleSetting(MemberRuleSetting memberRuleSetting)
	{
	    return memberRuleSettingMapper.updateMemberRuleSetting(memberRuleSetting);
	}

	/**
     * 删除会员积分成长规则对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteMemberRuleSettingByIds(String ids)
	{
		return memberRuleSettingMapper.deleteMemberRuleSettingByIds(Convert.toStrArray(ids));
	}
	
}
