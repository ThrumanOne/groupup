package com.thruman.pojo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 拼团产品表
 * <p>
 * 
 * @author WeBatis
 * @email 18523019@qq.com
 * @date 2018-12-12 09:04:32
 */
public class ProductEntity {

	private static final long serialVersionUID = 2141730790685805656L;
	/**
	 * 表自增ID
	 */
	private Long id;
	/**
	 * 商品id
	 */
	private Long productId;
	/**
	 * 商品编码
	 */
	private String barcode;
	/**
	 * 默认和商品名称一样
	 */
	private String productName;
	/**
	 * 门店编码
	 */
	private String storeCode;
	/**
	 * 拼团价格
	 */
	private BigDecimal groupPrice;
	/**
	 * 已卖出数量
	 */
	private Integer soldQuantity;
	/**
	 * 每人购买限制数量
	 */
	private Integer purchasedLimit;
	/**
	 * 安全库存，总库存小于安全库存不可售
	 */
	private Integer safetyStock;
	/**
	 * 冻结库存，下单后开始冻结库存，直到取消或提货
	 */
	private Integer fronzenStock;
	/**
	 * 排序
	 */
	private Integer sort;
	/**
	 * 1 到家
	 */
	private Integer type;
	/**
	 * 1 已删除；0 未删除
	 */
	private Integer deleted;
	/**
	 * 商品状态 1进行中 2已结束
	 */
	private Integer status;
	/**
	 * 拼团开始时间
	 */
	private Date startedAt;
	/**
	 * 拼团结束时间
	 */
	private Date endAt;
	/**
	 * 更新时间
	 */
	private Date updatedAt;
	/**
	 * 创建时间
	 */
	private Date createdAt;

	/**
	 * 设置：表自增ID
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 获取：表自增ID
	 */
	public Long getId() {
		return id;
	}

	/**
	 * 设置：商品id
	 */
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	/**
	 * 获取：商品id
	 */
	public Long getProductId() {
		return productId;
	}


	/**
	 * 设置：商品编码
	 */
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	/**
	 * 获取：商品编码
	 */
	public String getBarcode() {
		return barcode;
	}

	/**
	 * 设置：默认和商品名称一样
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * 获取：默认和商品名称一样
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * 设置：门店编码
	 */
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	/**
	 * 获取：门店编码
	 */
	public String getStoreCode() {
		return storeCode;
	}

	/**
	 * 设置：拼团价格
	 */
	public void setGroupPrice(BigDecimal groupPrice) {
		this.groupPrice = groupPrice;
	}

	/**
	 * 获取：拼团价格
	 */
	public BigDecimal getGroupPrice() {
		return groupPrice;
	}

	/**
	 * 设置：已卖出数量
	 */
	public void setSoldQuantity(Integer soldQuantity) {
		this.soldQuantity = soldQuantity;
	}

	/**
	 * 获取：已卖出数量
	 */
	public Integer getSoldQuantity() {
		return soldQuantity;
	}

	/**
	 * 设置：每人购买限制数量
	 */
	public void setPurchasedLimit(Integer purchasedLimit) {
		this.purchasedLimit = purchasedLimit;
	}

	/**
	 * 获取：每人购买限制数量
	 */
	public Integer getPurchasedLimit() {
		return purchasedLimit;
	}

	/**
	 * 设置：安全库存，总库存小于安全库存不可售
	 */
	public void setSafetyStock(Integer safetyStock) {
		this.safetyStock = safetyStock;
	}

	/**
	 * 获取：安全库存，总库存小于安全库存不可售
	 */
	public Integer getSafetyStock() {
		return safetyStock;
	}

	/**
	 * 设置：冻结库存，下单后开始冻结库存，直到取消或提货
	 */
	public void setFronzenStock(Integer fronzenStock) {
		this.fronzenStock = fronzenStock;
	}

	/**
	 * 获取：冻结库存，下单后开始冻结库存，直到取消或提货
	 */
	public Integer getFronzenStock() {
		return fronzenStock;
	}

	/**
	 * 设置：排序
	 */
	public void setSort(Integer sort) {
		this.sort = sort;
	}

	/**
	 * 获取：排序
	 */
	public Integer getSort() {
		return sort;
	}

	/**
	 * 设置：1 到家
	 */
	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 * 获取：1 到家
	 */
	public Integer getType() {
		return type;
	}

	/**
	 * 设置：1 已删除；0 未删除
	 */
	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

	/**
	 * 获取：1 已删除；0 未删除
	 */
	public Integer getDeleted() {
		return deleted;
	}

	/**
	 * 设置：商品状态 1进行中 2已结束
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * 获取：商品状态 1进行中 2已结束
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * 设置：拼团开始时间
	 */
	public void setStartedAt(Date startedAt) {
		this.startedAt = startedAt;
	}

	/**
	 * 获取：拼团开始时间
	 */
	public Date getStartedAt() {
		return startedAt;
	}

	/**
	 * 设置：拼团结束时间
	 */
	public void setEndAt(Date endAt) {
		this.endAt = endAt;
	}

	/**
	 * 获取：拼团结束时间
	 */
	public Date getEndAt() {
		return endAt;
	}

	/**
	 * 设置：更新时间
	 */
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	/**
	 * 获取：更新时间
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * 设置：创建时间
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * 获取：创建时间
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	@Override
	public String toString() {
		return "ProductEntity [id=" + id + ", productId=" + productId + ", barcode=" + barcode
				+ ", productName=" + productName + ", storeCode=" + storeCode + ", groupPrice=" + groupPrice
				+ ", soldQuantity=" + soldQuantity + ", purchasedLimit=" + purchasedLimit + ", safetyStock="
				+ safetyStock + ", fronzenStock=" + fronzenStock + ", sort=" + sort + ", type=" + type + ", deleted="
				+ deleted + ", status=" + status + ", startedAt=" + startedAt + ", endAt=" + endAt + ", updatedAt="
				+ updatedAt + ", createdAt=" + createdAt + "]";
	}

}
