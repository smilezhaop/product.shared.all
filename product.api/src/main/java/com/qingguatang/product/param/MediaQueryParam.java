package com.qingguatang.product.param;

import com.qingguatang.product.model.MediaType;

/**
 * 多媒体查询参数
 *
 * @author zhaopei
 * @date 2018/4/8
 */
public class MediaQueryParam {

  //关联ID
  private String refId;

  //媒体类型
  private MediaType type;

  //资源URL
  private String url;

  //资源上传者账户ID
  private String accountId;

  public String getRefId() {
    return refId;
  }

  public void setRefId(String refId) {
    this.refId = refId;
  }

  public MediaType getType() {
    return type;
  }

  public void setType(MediaType type) {
    this.type = type;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }
}
