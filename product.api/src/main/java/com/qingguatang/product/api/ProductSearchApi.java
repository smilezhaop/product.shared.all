package com.qingguatang.product.api;

import com.qingguatang.product.model.PagingData;
import com.qingguatang.product.model.Product;
import com.qingguatang.product.param.ProductQueryParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
  @RequestMapping(path = "api/product/query",produces = "application/json")
  @ResponseBody
  public PagingData<Product> query(ProductQueryParam param);

}
