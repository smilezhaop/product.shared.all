package com.qingguatang.product.dao;

import com.qingguatang.product.dataobject.ProductDO;
import com.qingguatang.product.param.ProductQueryParam;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductDAO {


  /**
   * 插入
   */
  int insert(ProductDO record);

  /**
   * 根据ID查询
   */
  ProductDO selectByKey(String id);

  /**
   * 条件参数查询
   */
  List<ProductDO> query(ProductQueryParam param);

  /**
   * 查询所有
   */
  List<ProductDO> selectAll();

  /**
   * 更新
   */
  int updateByKey(ProductDO record);

  /**
   * 批量更新
   */
  int batchUpdate(List<ProductDO> records);

}