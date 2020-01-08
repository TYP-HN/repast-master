package com.aaa.repast.admin.project.system.couponHistory.mapper;

import com.aaa.repast.admin.project.system.couponHistory.domain.CouponHistory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 优惠券使用、领取历史 数据层
 * 
 * @author Seven Lee
 * @date 2020-01-02
 */
@Repository
public interface CouponHistoryMapper 
{
	/**
     * 查询优惠券使用、领取历史信息
     * 
     * @param id 优惠券使用、领取历史ID
     * @return 优惠券使用、领取历史信息
     */
	public CouponHistory selectCouponHistoryById(Long id);
	
	/**
     * 查询优惠券使用、领取历史列表
     * 
     * @param couponHistory 优惠券使用、领取历史信息
     * @return 优惠券使用、领取历史集合
     */
	public List<CouponHistory> selectCouponHistoryList(CouponHistory couponHistory);
	
	/**
     * 新增优惠券使用、领取历史
     * 
     * @param couponHistory 优惠券使用、领取历史信息
     * @return 结果
     */
	public int insertCouponHistory(CouponHistory couponHistory);
	
	/**
     * 修改优惠券使用、领取历史
     * 
     * @param couponHistory 优惠券使用、领取历史信息
     * @return 结果
     */
	public int updateCouponHistory(CouponHistory couponHistory);
	
	/**
     * 删除优惠券使用、领取历史
     * 
     * @param id 优惠券使用、领取历史ID
     * @return 结果
     */
	public int deleteCouponHistoryById(Long id);
	
	/**
     * 批量删除优惠券使用、领取历史
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteCouponHistoryByIds(String[] ids);

	/**
	 * 根据优惠卷的id修改优惠卷历史的状态
	 * @param couponID
	 * @return
	 */
	int updateStatus(String couponID);
}