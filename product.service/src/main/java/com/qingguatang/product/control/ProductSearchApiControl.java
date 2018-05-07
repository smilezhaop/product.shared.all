package com.qingguatang.product.control;

import com.qingguatang.product.api.ProductSearchApi;
import com.qingguatang.product.dao.ProductDAO;
import com.qingguatang.product.dataobject.ProductDO;
import com.qingguatang.product.model.PagingData;
import com.qingguatang.product.model.Product;
import com.qingguatang.product.param.ProductQueryParam;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 商品查询服务实现
 *
 * @author zhaopei
 * @date 2018/5/4
 */
public class ProductSearchApiControl implements ProductSearchApi {

  @Autowired
  private ProductDAO productDAO;

  @Override
  public PagingData<Product> query(ProductQueryParam param) {

    PagingData pagingData = new PagingData<Product>();

    List<ProductDO> productDOList = new ArrayList<>();

    //参数判空处理
    if(param == null){
      productDOList =productDAO.selectAll();
    }else{
      productDOList = productDAO.query(param);
    }

    List<Product> productList = new ArrayList<>();
    //do->model
    for (ProductDO product : productDOList) {
      productList.add(product.convert());

    }

    pagingData.setData(productList);

    return pagingData;
  }
}
