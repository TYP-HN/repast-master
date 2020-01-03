package com.aaa.repast.admin.project.system.memberRuleSetting.controller;

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

import com.aaa.repast.admin.project.system.memberRuleSetting.domain.MemberRuleSetting;
import com.aaa.repast.admin.project.system.memberRuleSetting.service.IMemberRuleSettingService;

/**
 * 会员积分成长规则 信息操作处理
 * 
 * @author Seven Lee
 * @date 2020-01-02
 */
@Controller
@RequestMapping("/system/memberRuleSetting")
public class MemberRuleSettingController extends BaseController
{
    private String prefix = "system/memberRuleSetting";
	
	@Autowired
	private IMemberRuleSettingService memberRuleSettingService;
	
	@RequiresPermissions("system:memberRuleSetting:view")
	@GetMapping()
	public String memberRuleSetting()
	{
	    return prefix + "/memberRuleSetting";
	}
	
	/**
	 * 查询会员积分成长规则列表
	 */
	@RequiresPermissions("system:memberRuleSetting:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(MemberRuleSetting memberRuleSetting)
	{
		startPage();
        List<MemberRuleSetting> list = memberRuleSettingService.selectMemberRuleSettingList(memberRuleSetting);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出会员积分成长规则列表
	 */
	@RequiresPermissions("system:memberRuleSetting:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MemberRuleSetting memberRuleSetting)
    {
    	List<MemberRuleSetting> list = memberRuleSettingService.selectMemberRuleSettingList(memberRuleSetting);
        ExcelUtil<MemberRuleSetting> util = new ExcelUtil<MemberRuleSetting>(MemberRuleSetting.class);
        return util.exportExcel(list, "memberRuleSetting");
    }
	
	/**
	 * 新增会员积分成长规则
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存会员积分成长规则
	 */
	@RequiresPermissions("system:memberRuleSetting:add")
	@Log(title = "会员积分成长规则", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(MemberRuleSetting memberRuleSetting)
	{		
		return toAjax(memberRuleSettingService.insertMemberRuleSetting(memberRuleSetting));
	}

	/**
	 * 修改会员积分成长规则
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id, ModelMap mmap)
	{
		MemberRuleSetting memberRuleSetting = memberRuleSettingService.selectMemberRuleSettingById(id);
		mmap.put("memberRuleSetting", memberRuleSetting);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存会员积分成长规则
	 */
	@RequiresPermissions("system:memberRuleSetting:edit")
	@Log(title = "会员积分成长规则", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(MemberRuleSetting memberRuleSetting)
	{		
		return toAjax(memberRuleSettingService.updateMemberRuleSetting(memberRuleSetting));
	}
	
	/**
	 * 删除会员积分成长规则
	 */
	@RequiresPermissions("system:memberRuleSetting:remove")
	@Log(title = "会员积分成长规则", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(memberRuleSettingService.deleteMemberRuleSettingByIds(ids));
	}
	
}
