package com.qingguatang.product.model;

/**
 * 类目模型
 */
public class Category {

  private String id;

  private String name;

  private String media_id;

  private CategoryStatus status;

  private long sort;

  private String parentCategoryId;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getMedia_id() {
    return media_id;
  }

  public void setMedia_id(String media_id) {
    this.media_id = media_id;
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
}
