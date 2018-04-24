package com.qingguatang.product.model;

import java.util.Date;
import java.util.List;

/**
 * 类目模型
 *
 * @author zhaopei
 * @date 2018/4/8
 */
public class Category {

  private String id;
  //创建时间
  private Date gmtCreated;
  //修改时间
  private Date gmtModified;
  //类目名称
  private String name;
  //媒体ID
  private String mediaId;
  //类目状态
  private CategoryStatus status;
  //排序
  private long sort;
  //父类目ID
  private String parentCategoryId;

  private List<Category> children;

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

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getMediaId() {
    return mediaId;
  }

  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }

  public CategoryStatus getStatus() {
    return status;
  }

  public void setStatus(CategoryStatus status) {
    this.status = status;
  }

  public long getSort() {
    return sort;
  }

  public void setSort(long sort) {
    this.sort = sort;
  }

  public String getParentCategoryId() {
    return parentCategoryId;
  }

  public void setParentCategoryId(String parentCategoryId) {
    this.parentCategoryId = parentCategoryId;
  }

  public List<Category> getChildren() {
    return children;
  }

  public void setChildren(List<Category> children) {
    this.children = children;
  }
}
