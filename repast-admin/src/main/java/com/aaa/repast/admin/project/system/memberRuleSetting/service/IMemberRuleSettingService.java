package com.aaa.repast.admin.project.system.memberRuleSetting.service;

import com.aaa.repast.admin.project.system.memberRuleSetting.domain.MemberRuleSetting;
import java.util.List;

/**
 * 会员积分成长规则 服务层
 * 
 * @author Seven Lee
 * @date 2020-01-02
 */
public interface IMemberRuleSettingService 
{
	/**
     * 查询会员积分成长规则信息
     * 
     * @param id 会员积分成长规则ID
     * @return 会员积分成长规则信息
     */
	public MemberRuleSetting selectMemberRuleSettingById(Long id);
	
	/**
     * 查询会员积分成长规则列表
     * 
     * @param memberRuleSetting 会员积分成长规则信息
     * @return 会员积分成长规则集合
     */
	public List<MemberRuleSetting> selectMemberRuleSettingList(MemberRuleSetting memberRuleSetting);
	
	/**
     * 新增会员积分成长规则
     * 
     * @param memberRuleSetting 会员积分成长规则信息
     * @return 结果
     */
	public int insertMemberRuleSetting(MemberRuleSetting memberRuleSetting);
	
	/**
     * 修改会员积分成长规则
     * 
     * @param memberRuleSetting 会员积分成长规则信息
     * @return 结果
     */
	public int updateMemberRuleSetting(MemberRuleSetting memberRuleSetting);
		
	/**
     * 删除会员积分成长规则信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteMemberRuleSettingByIds(String ids);
	
}
