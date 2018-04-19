package com.qingguatang.product.api;

import com.qingguatang.product.model.Category;
import com.qingguatang.product.model.Result;
import com.qingguatang.product.service.CategoryService;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 类目API：提供类目创建、修改、删除、排序功能
 * @author zhaopei
 * @date 2018/4/8
 */
public interface CategoryApi {

  @RequestMapping(path = "api/category/save")
  @ResponseBody
  public Result<List<Category>> save(List<Category> categorys);

}
