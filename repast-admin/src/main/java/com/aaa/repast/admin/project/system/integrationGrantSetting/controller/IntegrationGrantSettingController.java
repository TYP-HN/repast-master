package com.aaa.repast.admin.project.system.integrationGrantSetting.controller;

import java.util.List;
import com.aaa.repast.admin.framework.aspectj.lang.annotation.Log;
import com.aaa.repast.admin.framework.aspectj.lang.enums.BusinessType;
import com.aaa.repast.admin.framework.poi.ExcelUtil;
import com.aaa.repast.admin.framework.web.controller.BaseController;
import com.aaa.repast.admin.framework.web.domain.AjaxResult;
import com.aaa.repast.admin.framework.web.page.TableDataInfo;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.repast.admin.project.system.integrationGrantSetting.domain.IntegrationGrantSetting;
import com.aaa.repast.admin.project.system.integrationGrantSetting.service.IIntegrationGrantSettingService;

/**
 * 积分发放设置 信息操作处理
 * 
 * @author Seven Lee
 * @date 2020-01-02
 */
@Controller
@RequestMapping("/system/integrationGrantSetting")
public class IntegrationGrantSettingController extends BaseController
{
    private String prefix = "system/integrationGrantSetting";
	
	@Autowired
	private IIntegrationGrantSettingService integrationGrantSettingService;
	
	@RequiresPermissions("system:integrationGrantSetting:view")
	@GetMapping()
	public String integrationGrantSetting()
	{
	    return prefix + "/integrationGrantSetting";
	}
	
	/**
	 * 查询积分发放设置列表
	 */
	@RequiresPermissions("system:integrationGrantSetting:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(IntegrationGrantSetting integrationGrantSetting)
	{
		startPage();
        List<IntegrationGrantSetting> list = integrationGrantSettingService.selectIntegrationGrantSettingList(integrationGrantSetting);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出积分发放设置列表
	 */
	@RequiresPermissions("system:integrationGrantSetting:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(IntegrationGrantSetting integrationGrantSetting)
    {
    	List<IntegrationGrantSetting> list = integrationGrantSettingService.selectIntegrationGrantSettingList(integrationGrantSetting);
        ExcelUtil<IntegrationGrantSetting> util = new ExcelUtil<IntegrationGrantSetting>(IntegrationGrantSetting.class);
        return util.exportExcel(list, "integrationGrantSetting");
    }
	
	/**
	 * 新增积分发放设置
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存积分发放设置
	 */
	@RequiresPermissions("system:integrationGrantSetting:add")
	@Log(title = "积分发放设置", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(IntegrationGrantSetting integrationGrantSetting)
	{		
		return toAjax(integrationGrantSettingService.insertIntegrationGrantSetting(integrationGrantSetting));
	}

	/**
	 * 修改积分发放设置
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id, ModelMap mmap)
	{
		IntegrationGrantSetting integrationGrantSetting = integrationGrantSettingService.selectIntegrationGrantSettingById(id);
		mmap.put("integrationGrantSetting", integrationGrantSetting);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存积分发放设置
	 */
	@RequiresPermissions("system:integrationGrantSetting:edit")
	@Log(title = "积分发放设置", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(IntegrationGrantSetting integrationGrantSetting)
	{		
		return toAjax(integrationGrantSettingService.updateIntegrationGrantSetting(integrationGrantSetting));
	}
	
	/**
	 * 删除积分发放设置
	 */
	@RequiresPermissions("system:integrationGrantSetting:remove")
	@Log(title = "积分发放设置", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(integrationGrantSettingService.deleteIntegrationGrantSettingByIds(ids));
	}
	
}
