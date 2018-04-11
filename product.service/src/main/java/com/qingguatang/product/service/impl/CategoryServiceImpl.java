package com.qingguatang.product.service.impl;

import com.qingguatang.product.dataobject.CategoryDO;
import com.qingguatang.product.model.Category;
import com.qingguatang.product.model.Media;
import com.qingguatang.product.model.Result;
import com.qingguatang.product.service.CategoryService;
import java.util.List;

public class CategoryServiceImpl implements CategoryService {

  @Override
  public Result<Category> addOrUpdate(Category category){

    CategoryDO categoryDO = new CategoryDO();
    categoryDO.setId(category.getId());
    categoryDO.setName(category.getName());
    categoryDO.setMediaId(category.getMediaId());
    categoryDO.setStatus(category.getStatus().toString());
    categoryDO.setSort(category.getSort());
    categoryDO.setParentCategoryId(category.getParentCategoryId());

    return null;
  }

  @Override
  public Result delete(String categoryId){

    return null;
  }

  @Override
  public Result sort(List<Category> categorys){

    return null;
  }

  @Override
  public Result<Media> add(Media media){

    return null;
  }
}
