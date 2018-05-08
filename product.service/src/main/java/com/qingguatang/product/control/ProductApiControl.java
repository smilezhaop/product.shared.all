package com.qingguatang.product.control;

import com.qingguatang.product.api.ProductApi;
import com.qingguatang.product.dao.ProductDAO;
import com.qingguatang.product.dataobject.ProductDO;
import com.qingguatang.product.model.Product;
import com.qingguatang.product.model.ProductStatus;
import com.qingguatang.product.model.Result;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 商品服务实现
 *
 * @author zhaopei
 * @date 2018/5/4
 */
@Controller
public class ProductApiControl extends ProductSearchApiControl implements ProductApi {

  @Autowired
  private ProductDAO productDAO;

  @Override
  public Result<Product> save(@RequestBody(required = false) Product product) {
    //获取模拟测试的数据
    product = getTestProduct();

    Result result = new Result<Product>();

    if (product == null) {
      result.setSuccess(false);
      result.setMessage("数据为空");
      result.setCode("null001");
      return result;
    }
    //草稿状态存入数据库
    product.setStatus(ProductStatus.draft);
    ProductDO productDo = convertToDO(product);
    productDAO.insert(productDo);

    //审核通过，更新状态
    product.setStatus(ProductStatus.approved);
    changeStatus(product.getId(), ProductStatus.approved);

    //判定是否上架，上架更新状态
    if (!product.getOnlineTime().after(new Date())) {
      product.setStatus(ProductStatus.online);
      changeStatus(product.getId(), ProductStatus.online);
    } else if (product.getOnlineTime().after(new Date())) {
      //定时上架，更新状态
      product.setStatus(ProductStatus.online);
      changeStatus(product.getId(), ProductStatus.online);
    }

    result.setSuccess(true);
    result.setData(product);

    return result;
  }


  @Override
  public Result<Boolean> changeStatus(String id, ProductStatus status) {
    Result result = new Result<Boolean>();

    ProductDO productDO = new ProductDO();
    productDO.setId(id);
    productDO.setStatus(status.toString());

    productDAO.updateStatus(productDO);

    result.setSuccess(true);

    return result;
  }

  /**
   * model->do
   *
   * @return ProductDO
   */
  private ProductDO convertToDO(Product product) {
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
    productDO.setMediaId("moo");
    return productDO;
  }

  //获取页面测试数据
  private Product getTestProduct() {
    Product testProduct = new Product();
    testProduct.setId("p06");
    testProduct.setTitle("pro06");
    testProduct.setCategoryId("A003");
    testProduct.setMainPictUrl("http://qgt006");
    testProduct.setShowPrice("166");
    testProduct.setLinePrice("111");
    testProduct.setSoldQuantity(88l);
    testProduct.setStock(12l);
    testProduct.setProductCode("006");
    testProduct.setAccountId("a06");
    testProduct.setStatus(ProductStatus.draft);
    testProduct.setDescription("this is testProduct");
    testProduct.setOnlineTime(new Date());

    return testProduct;
  }

}
