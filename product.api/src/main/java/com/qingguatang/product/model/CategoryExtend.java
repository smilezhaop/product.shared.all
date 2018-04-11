package com.qingguatang.product.model;

import java.util.List;

public class CategoryExtend extends Category{

  private String id;

  private String name;

  private String parentCategoryId;

  private List<CategoryExtend> categoryExtends;

  @Override
  public String getId() {
    return id;
  }

  @Override
  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String getParentCategoryId() {
    return parentCategoryId;
  }

  @Override
  public void setParentCategoryId(String parentCategoryId) {
    this.parentCategoryId = parentCategoryId;
  }

  @Override
  public List<CategoryExtend> getCategoryExtends() {
    return categoryExtends;
  }

  public void setCategoryExtends(
      List<CategoryExtend> categoryExtends) {
    this.categoryExtends = categoryExtends;
  }
}
