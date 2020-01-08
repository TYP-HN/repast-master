package com.aaa.repast.admin.project.system.comment.service;

import com.aaa.repast.common.support.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.aaa.repast.admin.project.system.comment.mapper.CommentMapper;
import com.aaa.repast.admin.project.system.comment.domain.Comment;

/**
 * 商品评价 服务层实现
 * 
 * @author Seven Lee
 * @date 2020-01-08
 */
@Service
public class CommentServiceImpl implements ICommentService 
{
	@Autowired
	private CommentMapper commentMapper;

	/**
     * 查询商品评价信息
     * 
     * @param id 商品评价ID
     * @return 商品评价信息
     */
    @Override
	public Comment selectCommentById(Long id)
	{
	    return commentMapper.selectCommentById(id);
	}
	
	/**
     * 查询商品评价列表
     * 
     * @param comment 商品评价信息
     * @return 商品评价集合
     */
	@Override
	public List<Comment> selectCommentList(Comment comment)
	{
	    return commentMapper.selectCommentList(comment);
	}
	
    /**
     * 新增商品评价
     * 
     * @param comment 商品评价信息
     * @return 结果
     */
	@Override
	public int insertComment(Comment comment)
	{
	    return commentMapper.insertComment(comment);
	}
	
	/**
     * 修改商品评价
     * 
     * @param comment 商品评价信息
     * @return 结果
     */
	@Override
	public int updateComment(Comment comment)
	{
	    return commentMapper.updateComment(comment);
	}

	/**
     * 删除商品评价对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteCommentByIds(String ids)
	{
		return commentMapper.deleteCommentByIds(Convert.toStrArray(ids));
	}
	
}
