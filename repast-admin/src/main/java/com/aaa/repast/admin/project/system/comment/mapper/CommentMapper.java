package com.aaa.repast.admin.project.system.comment.mapper;

import com.aaa.repast.admin.project.system.comment.domain.Comment;
import java.util.List;	

/**
 * 商品评价 数据层
 * 
 * @author Seven Lee
 * @date 2020-01-08
 */
public interface CommentMapper 
{
	/**
     * 查询商品评价信息
     * 
     * @param id 商品评价ID
     * @return 商品评价信息
     */
	public Comment selectCommentById(Long id);
	
	/**
     * 查询商品评价列表
     * 
     * @param comment 商品评价信息
     * @return 商品评价集合
     */
	public List<Comment> selectCommentList(Comment comment);
	
	/**
     * 新增商品评价
     * 
     * @param comment 商品评价信息
     * @return 结果
     */
	public int insertComment(Comment comment);
	
	/**
     * 修改商品评价
     * 
     * @param comment 商品评价信息
     * @return 结果
     */
	public int updateComment(Comment comment);
	
	/**
     * 删除商品评价
     * 
     * @param id 商品评价ID
     * @return 结果
     */
	public int deleteCommentById(Long id);
	
	/**
     * 批量删除商品评价
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteCommentByIds(String[] ids);
	
}