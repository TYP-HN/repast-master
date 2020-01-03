package com.aaa.repast.admin.project.system.integrationGrantSetting.service;

import com.aaa.repast.common.support.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.aaa.repast.admin.project.system.integrationGrantSetting.mapper.IntegrationGrantSettingMapper;
import com.aaa.repast.admin.project.system.integrationGrantSetting.domain.IntegrationGrantSetting;

/**
 * 积分发放设置 服务层实现
 * 
 * @author Seven Lee
 * @date 2020-01-02
 */
@Service
public class IntegrationGrantSettingServiceImpl implements IIntegrationGrantSettingService 
{
	@Autowired
	private IntegrationGrantSettingMapper integrationGrantSettingMapper;

	/**
     * 查询积分发放设置信息
     * 
     * @param id 积分发放设置ID
     * @return 积分发放设置信息
     */
    @Override
	public IntegrationGrantSetting selectIntegrationGrantSettingById(Long id)
	{
	    return integrationGrantSettingMapper.selectIntegrationGrantSettingById(id);
	}
	
	/**
     * 查询积分发放设置列表
     * 
     * @param integrationGrantSetting 积分发放设置信息
     * @return 积分发放设置集合
     */
	@Override
	public List<IntegrationGrantSetting> selectIntegrationGrantSettingList(IntegrationGrantSetting integrationGrantSetting)
	{
	    return integrationGrantSettingMapper.selectIntegrationGrantSettingList(integrationGrantSetting);
	}
	
    /**
     * 新增积分发放设置
     * 
     * @param integrationGrantSetting 积分发放设置信息
     * @return 结果
     */
	@Override
	public int insertIntegrationGrantSetting(IntegrationGrantSetting integrationGrantSetting)
	{
	    return integrationGrantSettingMapper.insertIntegrationGrantSetting(integrationGrantSetting);
	}
	
	/**
     * 修改积分发放设置
     * 
     * @param integrationGrantSetting 积分发放设置信息
     * @return 结果
     */
	@Override
	public int updateIntegrationGrantSetting(IntegrationGrantSetting integrationGrantSetting)
	{
	    return integrationGrantSettingMapper.updateIntegrationGrantSetting(integrationGrantSetting);
	}

	/**
     * 删除积分发放设置对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteIntegrationGrantSettingByIds(String ids)
	{
		return integrationGrantSettingMapper.deleteIntegrationGrantSettingByIds(Convert.toStrArray(ids));
	}
	
}
