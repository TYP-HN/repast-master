package com.aaa.repast.admin.project.system.integrationChangeHistory.service;

import com.aaa.repast.admin.project.system.integrationChangeHistory.domain.IntegrationChangeHistory;
import java.util.List;

/**
 * 积分变化历史记录 服务层
 * 
 * @author Seven Lee
 * @date 2020-01-02
 */
public interface IIntegrationChangeHistoryService 
{
	/**
     * 查询积分变化历史记录信息
     * 
     * @param id 积分变化历史记录ID
     * @return 积分变化历史记录信息
     */
	public IntegrationChangeHistory selectIntegrationChangeHistoryById(Long id);
	
	/**
     * 查询积分变化历史记录列表
     * 
     * @param integrationChangeHistory 积分变化历史记录信息
     * @return 积分变化历史记录集合
     */
	public List<IntegrationChangeHistory> selectIntegrationChangeHistoryList(IntegrationChangeHistory integrationChangeHistory);
	
	/**
     * 新增积分变化历史记录
     * 
     * @param integrationChangeHistory 积分变化历史记录信息
     * @return 结果
     */
	public int insertIntegrationChangeHistory(IntegrationChangeHistory integrationChangeHistory);
	
	/**
     * 修改积分变化历史记录
     * 
     * @param integrationChangeHistory 积分变化历史记录信息
     * @return 结果
     */
	public int updateIntegrationChangeHistory(IntegrationChangeHistory integrationChangeHistory);
		
	/**
     * 删除积分变化历史记录信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteIntegrationChangeHistoryByIds(String ids);
	
}
