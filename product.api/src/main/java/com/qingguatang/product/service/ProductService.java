package com.qingguatang.product.service;

import com.qingguatang.product.model.Product;
import com.qingguatang.product.model.Result;

/**
 * 商品基础服务：创建修改等
 *
 * @author zhaopei
 * @date 2018/5/2
 */
public interface ProductService {

  /**
   * 商品添加修改
   */
  public Result<Product> addOrUpdate(Product product);

}
