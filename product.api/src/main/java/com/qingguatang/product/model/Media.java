package com.qingguatang.product.model;

/**
 * 多媒体模型
 * @author zhaopei
 * @date 2018/4/8
 */
public class Media {

  private long id;
  //关联资源ID
  private String refId;
  //资源类型
  private MediaType type;
  //资源URL
  private String url;
  //资源上传者账户ID
  private String accountId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getRefId() {
    return refId;
  }

  public void setRefId(String refId) {
    this.refId = refId;
  }

  public String getUrl() {
    return url;
  }

  public MediaType getType() {
    return type;
  }

  public void setType(MediaType type) {
    this.type = type;
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
