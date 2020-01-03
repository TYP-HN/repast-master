package com.aaa.repast.admin.project.system.integrationGrantSetting.service;

import com.aaa.repast.admin.project.system.integrationGrantSetting.domain.IntegrationGrantSetting;
import java.util.List;

/**
 * 积分发放设置 服务层
 * 
 * @author Seven Lee
 * @date 2020-01-02
 */
public interface IIntegrationGrantSettingService 
{
	/**
     * 查询积分发放设置信息
     * 
     * @param id 积分发放设置ID
     * @return 积分发放设置信息
     */
	public IntegrationGrantSetting selectIntegrationGrantSettingById(Long id);
	
	/**
     * 查询积分发放设置列表
     * 
     * @param integrationGrantSetting 积分发放设置信息
     * @return 积分发放设置集合
     */
	public List<IntegrationGrantSetting> selectIntegrationGrantSettingList(IntegrationGrantSetting integrationGrantSetting);
	
	/**
     * 新增积分发放设置
     * 
     * @param integrationGrantSetting 积分发放设置信息
     * @return 结果
     */
	public int insertIntegrationGrantSetting(IntegrationGrantSetting integrationGrantSetting);
	
	/**
     * 修改积分发放设置
     * 
     * @param integrationGrantSetting 积分发放设置信息
     * @return 结果
     */
	public int updateIntegrationGrantSetting(IntegrationGrantSetting integrationGrantSetting);
		
	/**
     * 删除积分发放设置信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteIntegrationGrantSettingByIds(String ids);
	
}
