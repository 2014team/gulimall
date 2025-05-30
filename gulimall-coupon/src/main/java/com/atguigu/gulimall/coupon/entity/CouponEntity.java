package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

/**
 * 优惠券信息
 * 
 * @author zhuzq
 * @email zzeqing93@gmail.com
 * @date 2025-02-13 23:06:55
 */
@Data
@TableName("sms_coupon")
public class CouponEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 优惠卷类型[0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券]
	 */
	private Integer couponType;
	/**
	 * 优惠券图片
	 */
	private String couponImg;
	/**
	 * 优惠卷名字
	 */
	private String couponName;
	/**
	 * 数量
	 */
	private Integer num;
	/**
	 * 金额
	 */
	private BigDecimal amount;
	/**
	 * 每人限领张数
	 */
	private Integer perLimit;
	/**
	 * 使用门槛
	 */
	private BigDecimal minPoint;
	/**
	 * 开始时间
	 */
	private Date startTime;
	/**
	 * 结束时间
	 */
	private Date endTime;
	/**
	 * 使用类型[0->全场通用；1->指定分类；2->指定商品]
	 */
	private Integer useType;
	/**
	 * 备注
	 */
	private String note;
	/**
	 * 发行数量
	 */
	private Integer publishCount;
	/**
	 * 已使用数量
	 */
	private Integer useCount;
	/**
	 * 领取数量
	 */
	private Integer receiveCount;
	/**
	 * 可以领取的开始日期
	 */
	private Date enableStartTime;
	/**
	 * 可以领取的结束日期
	 */
	private Date enableEndTime;
	/**
	 * 优惠码
	 */
	private String code;
	/**
	 * 可以领取的会员等级[0->不限等级，其他-对应等级]
	 */
	private Integer memberLevel;
	/**
	 * 发布状态[0-未发布，1-已发布]
	 */
	private Integer publish;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCouponType() {
		return couponType;
	}

	public void setCouponType(Integer couponType) {
		this.couponType = couponType;
	}

	public String getCouponImg() {
		return couponImg;
	}

	public void setCouponImg(String couponImg) {
		this.couponImg = couponImg;
	}

	public String getCouponName() {
		return couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Integer getPerLimit() {
		return perLimit;
	}

	public void setPerLimit(Integer perLimit) {
		this.perLimit = perLimit;
	}

	public BigDecimal getMinPoint() {
		return minPoint;
	}

	public void setMinPoint(BigDecimal minPoint) {
		this.minPoint = minPoint;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Integer getUseType() {
		return useType;
	}

	public void setUseType(Integer useType) {
		this.useType = useType;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Integer getPublishCount() {
		return publishCount;
	}

	public void setPublishCount(Integer publishCount) {
		this.publishCount = publishCount;
	}

	public Integer getUseCount() {
		return useCount;
	}

	public void setUseCount(Integer useCount) {
		this.useCount = useCount;
	}

	public Integer getReceiveCount() {
		return receiveCount;
	}

	public void setReceiveCount(Integer receiveCount) {
		this.receiveCount = receiveCount;
	}

	public Date getEnableStartTime() {
		return enableStartTime;
	}

	public void setEnableStartTime(Date enableStartTime) {
		this.enableStartTime = enableStartTime;
	}

	public Date getEnableEndTime() {
		return enableEndTime;
	}

	public void setEnableEndTime(Date enableEndTime) {
		this.enableEndTime = enableEndTime;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getMemberLevel() {
		return memberLevel;
	}

	public void setMemberLevel(Integer memberLevel) {
		this.memberLevel = memberLevel;
	}

	public Integer getPublish() {
		return publish;
	}

	public void setPublish(Integer publish) {
		this.publish = publish;
	}
}
