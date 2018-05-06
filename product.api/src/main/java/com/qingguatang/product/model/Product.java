package com.qingguatang.product.model;

import java.util.Date;

/**
 * 商品模型
 *
 * @author zhaopei
 * @date 2018/5/2
 */
public class Product {

  private String id;
  //创建时间
  private Date gmtCreated;
  //修改时间
  private Date gmtModified;
  //商品标题
  private String title;
  //商品所属类目ID
  private String categoryId;
  //商品展示价格
  private String showPrice;
  //商品划线价
  private String linePrice;
  //商品主图URL
  private String mainPictUrl;
  //商品售出数量
  private Long soldQuantity;
  //商品库存
  private Long stock;
  //商品所属用户ID
  private String accountId;
  //商品编码
  private String productCode;
  //商品状态
  private ProductStatus status;
  //商品详情描述
  private String description;
  //上架时间
  private Date onlineTime;
  //下架时间
  private Date offlineTime;
  //category引用
  private Category category;
  //media引用
  private Media media;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Date getGmtCreated() {
    return gmtCreated;
  }

  public void setGmtCreated(Date gmtCreated) {
    this.gmtCreated = gmtCreated;
  }

  public Date getGmtModified() {
    return gmtModified;
  }

  public void setGmtModified(Date gmtModified) {
    this.gmtModified = gmtModified;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }

  public String getShowPrice() {
    return showPrice;
  }

  public void setShowPrice(String showPrice) {
    this.showPrice = showPrice;
  }

  public String getMainPictUrl() {
    return mainPictUrl;
  }

  public String getLinePrice() {
    return linePrice;
  }

  public void setLinePrice(String linePrice) {
    this.linePrice = linePrice;
  }

  public void setMainPictUrl(String mainPictUrl) {
    this.mainPictUrl = mainPictUrl;
  }

  public Long getSoldQuantity() {
    return soldQuantity;
  }

  public void setSoldQuantity(Long soldQuantity) {
    this.soldQuantity = soldQuantity;
  }

  public Long getStock() {
    return stock;
  }

  public void setStock(Long stock) {
    this.stock = stock;
  }

  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public ProductStatus getStatus() {
    return status;
  }

  public void setStatus(ProductStatus status) {
    this.status = status;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Date getOnlineTime() {
    return onlineTime;
  }

  public void setOnlineTime(Date onlineTime) {
    this.onlineTime = onlineTime;
  }

  public Date getOfflineTime() {
    return offlineTime;
  }

  public void setOfflineTime(Date offlineTime) {
    this.offlineTime = offlineTime;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public Media getMedia() {
    return media;
  }

  public void setMedia(Media media) {
    this.media = media;
  }


}
