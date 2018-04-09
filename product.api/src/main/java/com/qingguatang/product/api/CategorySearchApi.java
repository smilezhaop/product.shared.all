package com.qingguatang.product.api;

import com.qingguatang.product.model.Category;
import com.qingguatang.product.param.CategoryQueryParam;
import java.util.List;

/**
 * 类目查询服务：提供类目查询功能
 */
public interface CategorySearchApi {

  /**
   * 查询API
   * @param param
   * @return
   */
  public List<Category> query(CategoryQueryParam param);

}
