package com.qingguatang.product.service;

import com.qingguatang.product.model.Category;
import com.qingguatang.product.model.Result;
import java.util.List;

/**
 * 类目基础服务：提供类目创建、修改、排序等功能
 */
public interface CategoryService extends MediaService{

  /**
   * 类目创建更新
   * @param category
   * @return
   */
  public Result<Category> addOrUpdate(Category category);

  /**
   * 根据类目ID删除
   * @param categoryId
   * @return
   */
  public Result delete(String categoryId);

  /**
   * 类目排序
   * @param categorys
   * @return
   */
  public Result sort(List<Category> categorys);
}
