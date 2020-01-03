package com.aaa.repast.admin.project.system.couponHistory.service;

import com.aaa.repast.common.support.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.aaa.repast.admin.project.system.couponHistory.mapper.CouponHistoryMapper;
import com.aaa.repast.admin.project.system.couponHistory.domain.CouponHistory;

/**
 * 优惠券使用、领取历史 服务层实现
 * 
 * @author Seven Lee
 * @date 2020-01-02
 */
@Service
public class CouponHistoryServiceImpl implements ICouponHistoryService 
{
	@Autowired
	private CouponHistoryMapper couponHistoryMapper;

	/**
     * 查询优惠券使用、领取历史信息
     * 
     * @param id 优惠券使用、领取历史ID
     * @return 优惠券使用、领取历史信息
     */
    @Override
	public CouponHistory selectCouponHistoryById(Long id)
	{
	    return couponHistoryMapper.selectCouponHistoryById(id);
	}
	
	/**
     * 查询优惠券使用、领取历史列表
     * 
     * @param couponHistory 优惠券使用、领取历史信息
     * @return 优惠券使用、领取历史集合
     */
	@Override
	public List<CouponHistory> selectCouponHistoryList(CouponHistory couponHistory)
	{
	    return couponHistoryMapper.selectCouponHistoryList(couponHistory);
	}
	
    /**
     * 新增优惠券使用、领取历史
     * 
     * @param couponHistory 优惠券使用、领取历史信息
     * @return 结果
     */
	@Override
	public int insertCouponHistory(CouponHistory couponHistory)
	{
	    return couponHistoryMapper.insertCouponHistory(couponHistory);
	}
	
	/**
     * 修改优惠券使用、领取历史
     * 
     * @param couponHistory 优惠券使用、领取历史信息
     * @return 结果
     */
	@Override
	public int updateCouponHistory(CouponHistory couponHistory)
	{
	    return couponHistoryMapper.updateCouponHistory(couponHistory);
	}

	/**
     * 删除优惠券使用、领取历史对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteCouponHistoryByIds(String ids)
	{
		return couponHistoryMapper.deleteCouponHistoryByIds(Convert.toStrArray(ids));
	}
	
}
