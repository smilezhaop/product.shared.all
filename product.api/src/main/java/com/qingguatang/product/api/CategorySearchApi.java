package com.qingguatang.product.api;

import com.qingguatang.product.model.Category;
import com.qingguatang.product.param.CategoryQueryParam;
import java.util.List;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 类目查询服务：提供类目查询功能
 * @author zhaopei
 * @date 2018/4/8
 */
public interface CategorySearchApi {

  /**
   * 查询API
   * @param param
   * @return
   */
  @ResponseBody
  public List<Category> query(CategoryQueryParam param);

}
