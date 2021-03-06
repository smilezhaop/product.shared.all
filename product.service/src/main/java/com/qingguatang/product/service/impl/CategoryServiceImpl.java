package com.qingguatang.product.service.impl;

import com.qingguatang.product.dao.CategoryDAO;
import com.qingguatang.product.dataobject.CategoryDO;
import com.qingguatang.product.model.Category;
import com.qingguatang.product.model.CategoryStatus;
import com.qingguatang.product.model.Media;
import com.qingguatang.product.model.Result;
import com.qingguatang.product.service.CategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CategoryServiceImpl implements CategoryService {

  @Autowired
  private  CategoryDAO categoryDAO;

  @Override
  public Result<Category> addOrUpdate(Category category) {

    //model->do
    CategoryDO categoryDO = getCategoryDO(category);

    CategoryDO categoryDoQuery = categoryDAO.selectById(category.getId());
    if (categoryDoQuery==null) {//add
      categoryDAO.insert(categoryDO);
    } else {//update
      categoryDAO.update(categoryDO);
    }
    Result result = new Result<Category>();
    //假定成功
    result.setSuccess(true);
    result.setData(category);

    return result;
  }

  private CategoryDO getCategoryDO(Category category) {
    CategoryDO categoryDO = new CategoryDO();
    categoryDO.setId(category.getId());
    categoryDO.setName(category.getName());
    categoryDO.setMediaId(category.getMediaId());
    categoryDO.setStatus(category.getStatus().toString());
    categoryDO.setSort(category.getSort());
    categoryDO.setParentCategoryId(category.getParentCategoryId());
    return categoryDO;
  }

  @Override
  public Result delete(String categoryId) {
    Result result = new Result();
    categoryDAO.delete(categoryId);
    result.setSuccess(true);

    return result;
  }

  @Override
  public Result sort(List<Category> categorys) {

    return null;
  }

  @Override
  public Result<Media> add(Media media) {

    return null;
  }
}
