package com.qingguatang.product.param;

import com.qingguatang.product.model.MediaType;

/**
 * 多媒体查询参数
 * @author zhaopei
 * @date 2018/4/8
 */
public class MediaQueryParam {

  private String refId;

  private MediaType type;

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

  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }
}
