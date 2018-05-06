package com.qingguatang.product.service.impl;

import com.qingguatang.product.dao.ProductDAO;
import com.qingguatang.product.dataobject.ProductDO;
import com.qingguatang.product.model.Product;
import com.qingguatang.product.model.Result;
import com.qingguatang.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 商品服务实现
 *
 * @author zhaopei
 * @date 2018/5/4
 */
@Controller
public class ProductServiceImpl implements ProductService {

  @Autowired
  private ProductDAO productDAO;

  @Override
  public Result<Product> addOrUpdate(Product product) {

    Result result = new Result<Product>();
    //model->do
    ProductDO productDO = getProductDO(product);

    //查询数据库中是否已存在
    ProductDO productDOQuery = productDAO.selectByKey(product.getId());

    if (productDOQuery == null) {//add
      productDAO.insert(productDO);
    } else {//update
      productDAO.updateByKey(productDO);
    }

    //默认成功
    result.setSuccess(true);

    return result;
  }

  /**
   * model->do
   *
   * @param product
   * @return productDO
   */
  private ProductDO getProductDO(Product product) {
    ProductDO productDO = new ProductDO();

    productDO.setId(product.getId());
    productDO.setTitle(product.getTitle());
    productDO.setCategoryId(product.getCategoryId());
    productDO.setMainPictUrl(product.getMainPictUrl());
    productDO.setShowPrice(product.getShowPrice());
    productDO.setLinePrice(product.getLinePrice());
    productDO.setSoldQuantity(product.getSoldQuantity());
    productDO.setStock(product.getStock());
    productDO.setProductCode(product.getProductCode());
    productDO.setStatus(product.getStatus().toString());
    productDO.setAccountId(product.getAccountId());
    productDO.setDescription(product.getDescription());
    productDO.setOnlineTime(product.getOnlineTime());
    productDO.setOfflineTime(product.getOfflineTime());

    return productDO;
  }
}
