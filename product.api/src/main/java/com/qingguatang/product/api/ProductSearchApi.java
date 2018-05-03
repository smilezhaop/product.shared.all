package com.qingguatang.product.api;

import com.qingguatang.product.model.PagingData;
import com.qingguatang.product.model.Product;
import com.qingguatang.product.param.ProductQueryParam;

/**
 * 商品搜索API
 *
 * @author zhaopei
 * @date 2018/5/2
 */
public interface ProductSearchApi {

  /**
   * 商品搜索
   */
  public PagingData<Product> query(ProductQueryParam param);

}
