package com.qingguatang.product.dao;

import com.qingguatang.product.dataobject.ProductDO;
import java.util.List;

public interface ProductDAO {
    int deleteByPrimaryKey(String id);

    int insert(ProductDO record);

    ProductDO selectByPrimaryKey(String id);

    List<ProductDO> selectAll();

    int updateByPrimaryKey(ProductDO record);
}