package com.qingguatang.product.control;

import com.qingguatang.product.api.ProductApi;
import com.qingguatang.product.model.Product;
import com.qingguatang.product.model.ProductStatus;
import com.qingguatang.product.model.Result;

/**
 * 商品服务实现
 *
 * @author zhaopei
 * @date 2018/5/4
 */
public class ProductApiControl extends ProductSearchApiControl implements ProductApi {

  @Override
  public Result<Product> save(Product product) {
    return null;
  }

  @Override
  public Result<Boolean> changeStatus(String id, ProductStatus status) {
    return null;
  }
}
