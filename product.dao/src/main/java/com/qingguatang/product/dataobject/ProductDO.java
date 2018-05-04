package com.qingguatang.product.dataobject;

import java.util.Date;

public class ProductDO {
    /**主键唯一*/
    private String id;

    /**创建时间*/
    private Date gmtCreated;

    /**修改时间*/
    private Date gmtModifiled;

    /**商品标题*/
    private String title;

    /**商品所属类目ID*/
    private String categoryId;

    /**商品展示价格*/
    private String showPrice;

    /**划线价*/
    private String linePrice;

    /**商品主图url*/
    private String mainPictUrl;

    /**售出数量*/
    private Long soldQuantity;

    /**库存*/
    private Long stock;

    /**商品所属用户ID*/
    private String accountId;

    /**商品编码*/
    private String productCode;

    /**商品状态*/
    private String status;

    /**商品详情描述*/
    private String description;

    /**上架时间*/
    private Date onlineTime;

    /**下架时间*/
    private Date offlineTime;

    /**关联media主键*/
    private String mediaId;

    /**获取主键唯一*/
    public String getId() {
        return id;
    }

    /**设置主键唯一*/
    public void setId(String id) {
        this.id = id;
    }

    /**获取创建时间*/
    public Date getGmtCreated() {
        return gmtCreated;
    }

    /**设置创建时间*/
    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    /**获取修改时间*/
    public Date getGmtModifiled() {
        return gmtModifiled;
    }

    /**设置修改时间*/
    public void setGmtModifiled(Date gmtModifiled) {
        this.gmtModifiled = gmtModifiled;
    }

    /**获取商品标题*/
    public String getTitle() {
        return title;
    }

    /**设置商品标题*/
    public void setTitle(String title) {
        this.title = title;
    }

    /**获取商品所属类目ID*/
    public String getCategoryId() {
        return categoryId;
    }

    /**设置商品所属类目ID*/
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    /**获取商品展示价格*/
    public String getShowPrice() {
        return showPrice;
    }

    /**设置商品展示价格*/
    public void setShowPrice(String showPrice) {
        this.showPrice = showPrice;
    }

    /**获取划线价*/
    public String getLinePrice() {
        return linePrice;
    }

    /**设置划线价*/
    public void setLinePrice(String linePrice) {
        this.linePrice = linePrice;
    }

    /**获取商品主图url*/
    public String getMainPictUrl() {
        return mainPictUrl;
    }

    /**设置商品主图url*/
    public void setMainPictUrl(String mainPictUrl) {
        this.mainPictUrl = mainPictUrl;
    }

    /**获取售出数量*/
    public Long getSoldQuantity() {
        return soldQuantity;
    }

    /**设置售出数量*/
    public void setSoldQuantity(Long soldQuantity) {
        this.soldQuantity = soldQuantity;
    }

    /**获取库存*/
    public Long getStock() {
        return stock;
    }

    /**设置库存*/
    public void setStock(Long stock) {
        this.stock = stock;
    }

    /**获取商品所属用户ID*/
    public String getAccountId() {
        return accountId;
    }

    /**设置商品所属用户ID*/
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**获取商品编码*/
    public String getProductCode() {
        return productCode;
    }

    /**设置商品编码*/
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    /**获取商品状态*/
    public String getStatus() {
        return status;
    }

    /**设置商品状态*/
    public void setStatus(String status) {
        this.status = status;
    }

    /**获取商品详情描述*/
    public String getDescription() {
        return description;
    }

    /**设置商品详情描述*/
    public void setDescription(String description) {
        this.description = description;
    }

    /**获取上架时间*/
    public Date getOnlineTime() {
        return onlineTime;
    }

    /**设置上架时间*/
    public void setOnlineTime(Date onlineTime) {
        this.onlineTime = onlineTime;
    }

    /**获取下架时间*/
    public Date getOfflineTime() {
        return offlineTime;
    }

    /**设置下架时间*/
    public void setOfflineTime(Date offlineTime) {
        this.offlineTime = offlineTime;
    }

    /**获取关联media主键*/
    public String getMediaId() {
        return mediaId;
    }

    /**设置关联media主键*/
    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }
}