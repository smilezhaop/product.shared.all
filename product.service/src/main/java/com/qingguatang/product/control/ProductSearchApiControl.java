package com.qingguatang.product.control;

import com.qingguatang.product.api.ProductSearchApi;
import com.qingguatang.product.model.PagingData;
import com.qingguatang.product.model.Product;
import com.qingguatang.product.param.ProductQueryParam;

/**
 * 商品查询服务实现
 *
 * @author zhaopei
 * @date 2018/5/4
 */
public class ProductSearchApiControl implements ProductSearchApi {

  @Override
  public PagingData<Product> query(ProductQueryParam param) {
    return null;
  }
}
