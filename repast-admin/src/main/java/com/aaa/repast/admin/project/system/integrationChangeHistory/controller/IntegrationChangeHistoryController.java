package com.aaa.repast.admin.project.system.integrationChangeHistory.controller;

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

import com.aaa.repast.admin.project.system.integrationChangeHistory.domain.IntegrationChangeHistory;
import com.aaa.repast.admin.project.system.integrationChangeHistory.service.IIntegrationChangeHistoryService;

/**
 * 积分变化历史记录 信息操作处理
 * 
 * @author Seven Lee
 * @date 2020-01-02
 */
@Controller
@RequestMapping("/system/integrationChangeHistory")
public class IntegrationChangeHistoryController extends BaseController
{
    private String prefix = "system/integrationChangeHistory";
	
	@Autowired
	private IIntegrationChangeHistoryService integrationChangeHistoryService;
	
	@RequiresPermissions("system:integrationChangeHistory:view")
	@GetMapping()
	public String integrationChangeHistory()
	{
	    return prefix + "/integrationChangeHistory";
	}
	
	/**
	 * 查询积分变化历史记录列表
	 */
	@RequiresPermissions("system:integrationChangeHistory:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(IntegrationChangeHistory integrationChangeHistory)
	{
		startPage();
        List<IntegrationChangeHistory> list = integrationChangeHistoryService.selectIntegrationChangeHistoryList(integrationChangeHistory);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出积分变化历史记录列表
	 */
	@RequiresPermissions("system:integrationChangeHistory:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(IntegrationChangeHistory integrationChangeHistory)
    {
    	List<IntegrationChangeHistory> list = integrationChangeHistoryService.selectIntegrationChangeHistoryList(integrationChangeHistory);
        ExcelUtil<IntegrationChangeHistory> util = new ExcelUtil<IntegrationChangeHistory>(IntegrationChangeHistory.class);
        return util.exportExcel(list, "integrationChangeHistory");
    }
	
	/**
	 * 新增积分变化历史记录
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存积分变化历史记录
	 */
	@RequiresPermissions("system:integrationChangeHistory:add")
	@Log(title = "积分变化历史记录", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(IntegrationChangeHistory integrationChangeHistory)
	{		
		return toAjax(integrationChangeHistoryService.insertIntegrationChangeHistory(integrationChangeHistory));
	}

	/**
	 * 修改积分变化历史记录
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id, ModelMap mmap)
	{
		IntegrationChangeHistory integrationChangeHistory = integrationChangeHistoryService.selectIntegrationChangeHistoryById(id);
		mmap.put("integrationChangeHistory", integrationChangeHistory);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存积分变化历史记录
	 */
	@RequiresPermissions("system:integrationChangeHistory:edit")
	@Log(title = "积分变化历史记录", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(IntegrationChangeHistory integrationChangeHistory)
	{		
		return toAjax(integrationChangeHistoryService.updateIntegrationChangeHistory(integrationChangeHistory));
	}
	
	/**
	 * 删除积分变化历史记录
	 */
	@RequiresPermissions("system:integrationChangeHistory:remove")
	@Log(title = "积分变化历史记录", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(integrationChangeHistoryService.deleteIntegrationChangeHistoryByIds(ids));
	}
	
}
