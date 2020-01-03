package com.aaa.repast.admin.project.system.couponHistory.controller;

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

import com.aaa.repast.admin.project.system.couponHistory.domain.CouponHistory;
import com.aaa.repast.admin.project.system.couponHistory.service.ICouponHistoryService;

/**
 * 优惠券使用、领取历史 信息操作处理
 * 
 * @author Seven Lee
 * @date 2020-01-02
 */
@Controller
@RequestMapping("/system/couponHistory")
public class CouponHistoryController extends BaseController
{
    private String prefix = "system/couponHistory";
	
	@Autowired
	private ICouponHistoryService couponHistoryService;
	
	@RequiresPermissions("system:couponHistory:view")
	@GetMapping()
	public String couponHistory()
	{
	    return prefix + "/couponHistory";
	}
	
	/**
	 * 查询优惠券使用、领取历史列表
	 */
	@RequiresPermissions("system:couponHistory:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(CouponHistory couponHistory)
	{
		startPage();
        List<CouponHistory> list = couponHistoryService.selectCouponHistoryList(couponHistory);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出优惠券使用、领取历史列表
	 */
	@RequiresPermissions("system:couponHistory:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CouponHistory couponHistory)
    {
    	List<CouponHistory> list = couponHistoryService.selectCouponHistoryList(couponHistory);
        ExcelUtil<CouponHistory> util = new ExcelUtil<CouponHistory>(CouponHistory.class);
        return util.exportExcel(list, "couponHistory");
    }
	
	/**
	 * 新增优惠券使用、领取历史
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存优惠券使用、领取历史
	 */
	@RequiresPermissions("system:couponHistory:add")
	@Log(title = "优惠券使用、领取历史", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(CouponHistory couponHistory)
	{		
		return toAjax(couponHistoryService.insertCouponHistory(couponHistory));
	}

	/**
	 * 修改优惠券使用、领取历史
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id, ModelMap mmap)
	{
		CouponHistory couponHistory = couponHistoryService.selectCouponHistoryById(id);
		mmap.put("couponHistory", couponHistory);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存优惠券使用、领取历史
	 */
	@RequiresPermissions("system:couponHistory:edit")
	@Log(title = "优惠券使用、领取历史", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(CouponHistory couponHistory)
	{		
		return toAjax(couponHistoryService.updateCouponHistory(couponHistory));
	}
	
	/**
	 * 删除优惠券使用、领取历史
	 */
	@RequiresPermissions("system:couponHistory:remove")
	@Log(title = "优惠券使用、领取历史", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(couponHistoryService.deleteCouponHistoryByIds(ids));
	}
	
}
