package com.qingguatang.product.param;

import com.qingguatang.product.model.CategoryStatus;

/**
 * 类目查询参数
 *
 * @author zhaopei
 * @date 2018/4/8
 */
public class CategoryQueryParam {

  private String name;

  private String refId;

  private CategoryStatus status;

  private int sort;

  private String parentCategoryId;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRefId() {
    return refId;
  }

  public void setRefId(String refId) {
    this.refId = refId;
  }

  public CategoryStatus getStatus() {
    return status;
  }

  public void setStatus(CategoryStatus status) {
    this.status = status;
  }

  public int getSort() {
    return sort;
  }

  public void setSort(int sort) {
    this.sort = sort;
  }

  public String getParentCategoryId() {
    return parentCategoryId;
  }

  public void setParentCategoryId(String parentCategoryId) {
    this.parentCategoryId = parentCategoryId;
  }
}
