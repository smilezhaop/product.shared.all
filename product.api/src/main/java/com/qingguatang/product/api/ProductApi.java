package com.qingguatang.product.api;

import com.qingguatang.product.model.Product;
import com.qingguatang.product.model.ProductStatus;
import com.qingguatang.product.model.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 商品API：提供商品的保存，修改状态等
 *
 * @author zhaopei
 * @date 2018/5/2
 */
public interface ProductApi {

  /**
   * 商品保存
   */
  @RequestMapping(path = "api/product/save")
  @ResponseBody
  public Result<Product> save(Product product);

  /**
   * 修改商品状态
   */
  public Result<Boolean> changeStatus(String id, ProductStatus status);
}
