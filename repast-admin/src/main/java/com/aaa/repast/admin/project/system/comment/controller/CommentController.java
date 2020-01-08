package com.aaa.repast.admin.project.system.comment.controller;

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

import com.aaa.repast.admin.project.system.comment.domain.Comment;
import com.aaa.repast.admin.project.system.comment.service.ICommentService;

/**
 * 商品评价 信息操作处理
 * 
 * @author Seven Lee
 * @date 2020-01-08
 */
@Controller
@RequestMapping("/system/comment")
public class CommentController extends BaseController
{
    private String prefix = "system/comment";
	
	@Autowired
	private ICommentService commentService;
	
	@RequiresPermissions("system:comment:view")
	@GetMapping()
	public String comment()
	{
	    return prefix + "/comment";
	}
	
	/**
	 * 查询商品评价列表
	 */
	@RequiresPermissions("system:comment:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Comment comment)
	{
		startPage();
        List<Comment> list = commentService.selectCommentList(comment);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出商品评价列表
	 */
	@RequiresPermissions("system:comment:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Comment comment)
    {
    	List<Comment> list = commentService.selectCommentList(comment);
        ExcelUtil<Comment> util = new ExcelUtil<Comment>(Comment.class);
        return util.exportExcel(list, "comment");
    }
	
	/**
	 * 新增商品评价
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存商品评价
	 */
	@RequiresPermissions("system:comment:add")
	@Log(title = "商品评价", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Comment comment)
	{		
		return toAjax(commentService.insertComment(comment));
	}

	/**
	 * 修改商品评价
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id, ModelMap mmap)
	{
		Comment comment = commentService.selectCommentById(id);
		mmap.put("comment", comment);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存商品评价
	 */
	@RequiresPermissions("system:comment:edit")
	@Log(title = "商品评价", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Comment comment)
	{		
		return toAjax(commentService.updateComment(comment));
	}
	
	/**
	 * 删除商品评价
	 */
	@RequiresPermissions("system:comment:remove")
	@Log(title = "商品评价", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(commentService.deleteCommentByIds(ids));
	}
	
}
