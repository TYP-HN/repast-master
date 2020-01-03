package com.aaa.repast.admin.project.system.memberReceiveAddress.controller;

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

import com.aaa.repast.admin.project.system.memberReceiveAddress.domain.MemberReceiveAddress;
import com.aaa.repast.admin.project.system.memberReceiveAddress.service.IMemberReceiveAddressService;

/**
 * 会员收货地址 信息操作处理
 * 
 * @author Seven Lee
 * @date 2019-12-30
 */
@Controller
@RequestMapping("/system/memberReceiveAddress")
public class MemberReceiveAddressController extends BaseController
{
    private String prefix = "system/memberReceiveAddress";
	
	@Autowired
	private IMemberReceiveAddressService memberReceiveAddressService;
	
	@RequiresPermissions("system:memberReceiveAddress:view")
	@GetMapping()
	public String memberReceiveAddress()
	{
	    return prefix + "/memberReceiveAddress";
	}
	
	/**
	 * 查询会员收货地址列表
	 */
	@RequiresPermissions("system:memberReceiveAddress:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(MemberReceiveAddress memberReceiveAddress)
	{
		startPage();
        List<MemberReceiveAddress> list = memberReceiveAddressService.selectMemberReceiveAddressList(memberReceiveAddress);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出会员收货地址列表
	 */
	@RequiresPermissions("system:memberReceiveAddress:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MemberReceiveAddress memberReceiveAddress)
    {
    	List<MemberReceiveAddress> list = memberReceiveAddressService.selectMemberReceiveAddressList(memberReceiveAddress);
        ExcelUtil<MemberReceiveAddress> util = new ExcelUtil<MemberReceiveAddress>(MemberReceiveAddress.class);
        return util.exportExcel(list, "memberReceiveAddress");
    }
	
	/**
	 * 新增会员收货地址
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存会员收货地址
	 */
	@RequiresPermissions("system:memberReceiveAddress:add")
	@Log(title = "会员收货地址", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(MemberReceiveAddress memberReceiveAddress)
	{		
		return toAjax(memberReceiveAddressService.insertMemberReceiveAddress(memberReceiveAddress));
	}

	/**
	 * 修改会员收货地址
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id, ModelMap mmap)
	{
		MemberReceiveAddress memberReceiveAddress = memberReceiveAddressService.selectMemberReceiveAddressById(id);
		mmap.put("memberReceiveAddress", memberReceiveAddress);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存会员收货地址
	 */
	@RequiresPermissions("system:memberReceiveAddress:edit")
	@Log(title = "会员收货地址", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(MemberReceiveAddress memberReceiveAddress)
	{		
		return toAjax(memberReceiveAddressService.updateMemberReceiveAddress(memberReceiveAddress));
	}
	
	/**
	 * 删除会员收货地址
	 */
	@RequiresPermissions("system:memberReceiveAddress:remove")
	@Log(title = "会员收货地址", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(memberReceiveAddressService.deleteMemberReceiveAddressByIds(ids));
	}
	
}
