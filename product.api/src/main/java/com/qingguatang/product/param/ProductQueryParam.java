package com.qingguatang.product.param;

import com.qingguatang.product.model.ProductStatus;
import java.util.Date;

/**
 * 商品查询参数
 *
 * @author zhaopei
 * @date 2018/5/2
 */
public class ProductQueryParam {

  //商品id
  private String id;
  //商品名称
  private String title;
  //商品状态
  private ProductStatus status;
  //商品价格
  private String showPrice;
  //商品上架时间
  private Date onlineTime;
  //商品下架时间
  private Date offlineTime;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ProductStatus getStatus() {
    return status;
  }

  public void setStatus(ProductStatus status) {
    this.status = status;
  }

  public String getShowPrice() {
    return showPrice;
  }

  public void setShowPrice(String showPrice) {
    this.showPrice = showPrice;
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
}
