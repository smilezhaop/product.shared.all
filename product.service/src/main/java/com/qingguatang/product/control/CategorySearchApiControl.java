package com.qingguatang.product.control;

import com.qingguatang.product.dao.CategoryDAO;
import com.qingguatang.product.dataobject.CategoryDO;
import com.qingguatang.product.model.Category;
import com.qingguatang.product.model.CategoryExtend;
import com.qingguatang.product.param.CategoryQueryParam;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

public class CategorySearchApiControl {

  @Autowired
  private CategoryDAO categoryDAO;

  @Override
  public List<Category> query(CategoryQueryParam param){

    List<CategoryDO> categoryDOList = categoryDAO.query();

    Map<String, CategoryExtend> categoryMap = new LinkedHashMap<>();
    //把List转换为Map对象
    for (CategoryDO categoryDO : categoryDOList) {
      //转换do-model
      CategoryExtend category = categoryDO.convert();
      categoryMap.put(category.getId(),category);
    }
    //把子类目放到父类目的children对象里
    categoryMap.forEach((id,category)->{
      CategoryExtend parent = null;
      if (categoryMap.containsKey(category.getParentCategoryId())) {
        parent = categoryMap.get(category.getParentCategoryId());
      }else {
        parent = new CategoryExtend();
        parent.setId("0");
        categoryMap.put("0",parent);
      }
      category.getChildren().add(category);
    });

    List<Category> categories = categoryMap.get("0").getChildren();

    return categories;

  }

}
