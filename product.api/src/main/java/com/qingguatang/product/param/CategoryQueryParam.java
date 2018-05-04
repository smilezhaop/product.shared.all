package com.qingguatang.product.param;

import com.qingguatang.product.model.CategoryStatus;

/**
 * 类目查询参数
 *
 * @author zhaopei
 * @date 2018/4/8
 */
public class CategoryQueryParam {

  //类目名称
  private String name;
  //图片关联ID
  private String refId;
  //类目状态
  private CategoryStatus status;
  //类目排序
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
