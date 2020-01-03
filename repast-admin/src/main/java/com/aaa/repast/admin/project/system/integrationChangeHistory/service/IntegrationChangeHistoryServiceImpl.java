package com.aaa.repast.admin.project.system.integrationChangeHistory.service;

import com.aaa.repast.common.support.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.aaa.repast.admin.project.system.integrationChangeHistory.mapper.IntegrationChangeHistoryMapper;
import com.aaa.repast.admin.project.system.integrationChangeHistory.domain.IntegrationChangeHistory;

/**
 * 积分变化历史记录 服务层实现
 * 
 * @author Seven Lee
 * @date 2020-01-02
 */
@Service
public class IntegrationChangeHistoryServiceImpl implements IIntegrationChangeHistoryService 
{
	@Autowired
	private IntegrationChangeHistoryMapper integrationChangeHistoryMapper;

	/**
     * 查询积分变化历史记录信息
     * 
     * @param id 积分变化历史记录ID
     * @return 积分变化历史记录信息
     */
    @Override
	public IntegrationChangeHistory selectIntegrationChangeHistoryById(Long id)
	{
	    return integrationChangeHistoryMapper.selectIntegrationChangeHistoryById(id);
	}
	
	/**
     * 查询积分变化历史记录列表
     * 
     * @param integrationChangeHistory 积分变化历史记录信息
     * @return 积分变化历史记录集合
     */
	@Override
	public List<IntegrationChangeHistory> selectIntegrationChangeHistoryList(IntegrationChangeHistory integrationChangeHistory)
	{
	    return integrationChangeHistoryMapper.selectIntegrationChangeHistoryList(integrationChangeHistory);
	}
	
    /**
     * 新增积分变化历史记录
     * 
     * @param integrationChangeHistory 积分变化历史记录信息
     * @return 结果
     */
	@Override
	public int insertIntegrationChangeHistory(IntegrationChangeHistory integrationChangeHistory)
	{
	    return integrationChangeHistoryMapper.insertIntegrationChangeHistory(integrationChangeHistory);
	}
	
	/**
     * 修改积分变化历史记录
     * 
     * @param integrationChangeHistory 积分变化历史记录信息
     * @return 结果
     */
	@Override
	public int updateIntegrationChangeHistory(IntegrationChangeHistory integrationChangeHistory)
	{
	    return integrationChangeHistoryMapper.updateIntegrationChangeHistory(integrationChangeHistory);
	}

	/**
     * 删除积分变化历史记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteIntegrationChangeHistoryByIds(String ids)
	{
		return integrationChangeHistoryMapper.deleteIntegrationChangeHistoryByIds(Convert.toStrArray(ids));
	}
	
}
