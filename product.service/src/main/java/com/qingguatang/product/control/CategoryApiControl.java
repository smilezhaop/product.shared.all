package com.qingguatang.product.control;

import com.qingguatang.product.api.CategoryApi;
import com.qingguatang.product.model.Category;

import com.qingguatang.product.model.Result;
import java.util.List;
import org.springframework.stereotype.Controller;

/**
 * @author zhaopei
 * @date 2018/4/9
 */
@Controller
public class CategoryApiControl implements CategoryApi {

  @Override
  public Result<List<Category>> save(List<Category> categorys) {

    return null;
  }


}
