package com.qingguatang.product.control;

import com.qingguatang.product.api.CategoryApi;
import com.qingguatang.product.dao.CategoryDAO;
import com.qingguatang.product.dataobject.CategoryDO;
import com.qingguatang.product.model.Category;
import com.qingguatang.product.model.CategoryStatus;
import com.qingguatang.product.model.Result;
import com.qingguatang.product.param.CategoryQueryParam;
import com.qingguatang.product.service.impl.CategoryServiceImpl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 类目服务实现
 *
 * @author zhaopei
 * @date 2018/4/9
 */
@Controller
public class CategoryApiControl extends CategorySearchApiControl implements CategoryApi {

  @Autowired
  private CategoryServiceImpl categoryService;
  @Autowired
  private CategoryDAO categoryDAO;


  /**
   * 保存（添加删除修改）
   */
  @Override
  public Result<List<Category>> save(@RequestBody(required = false) List<Category> categorys) {

    //模拟获取的数据
    categorys = getTestDatas();

    Result results = new Result<List<Category>>();
    results.setSuccess(true);

    //非空判断
    if (categorys.size() == 0) {
      results.setSuccess(false);
      results.setCode("null001");
      results.setMessage("数据为空");
      return results;
    }

    //获取历史类目数据
    List<Category> categoryList = getCategories();

    Map<String, Category> categoryMapOld = new LinkedHashMap<>();
    //把List转换为Map对象
    for (Category categoryDO : categoryList) {
      Category category = new Category();
      categoryMapOld.put(categoryDO.getId(), category);
    }

    //新类目数据
    Map<String, Category> categoryMapNew = new LinkedHashMap<>();
    //把List转换为Map对象
    for (Category categoryNew : categorys) {
      Category category = new Category();
      categoryMapNew.put(categoryNew.getId(), category);
    }

    //遍历传入类目数据判断类目是否存在
    for (Category category : categorys) {
      if (categoryMapOld.containsKey(category.getId())) {//存在
        //判断历史类目ID是否存在
        for (Category categoryl : categoryList) {
          if (categoryMapNew.containsKey(categoryl.getId())) {//存在，修改更新
            categoryService.addOrUpdate(categoryl);
          } else {//不存在，删除
            categoryService.delete(categoryl.getId());
          }
        }
      } else {//不存在，增加insert
        categoryService.addOrUpdate(category);
      }
    }
    results.setData(categorys);

    return results;
  }

  /**
   * 获取数据库类目并do->model
   */
  private List<Category> getCategories() {
    List<Category> categoryList = new ArrayList<>();
    List<CategoryDO> categoryDOS = categoryDAO.queryAll();
    for (CategoryDO category : categoryDOS) {
      categoryList.add(category.convert());
    }
    return categoryList;
  }

  //手动模拟测试数据
  public List<Category> getTestDatas() {

    List<Category> categories = this.getCategories();

    Category category = new Category();
    category.setId("D001");
    category.setName("测试添加");
    category.setStatus(CategoryStatus.enabled);
    category.setMediaId("Mtest");
    category.setSort(41l);
    category.setParentCategoryId("CROOT");
    categories.add(category);

    return categories;
  }

}
