package com.qingguatang.product.control;

import com.qingguatang.product.api.CategoryApi;
import com.qingguatang.product.dao.CategoryDAO;
import com.qingguatang.product.dao.MediaDAO;
import com.qingguatang.product.dataobject.CategoryDO;
import com.qingguatang.product.dataobject.MediaDO;
import com.qingguatang.product.model.Category;

import com.qingguatang.product.model.Media;
import com.qingguatang.product.model.Result;
import com.qingguatang.product.param.CategoryQueryParam;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author zhaopei
 * @date 2018/4/9
 */
@Controller
public class CategoryApiControl extends CategorySearchApiControl implements CategoryApi {

  @Autowired
  private CategoryDAO categoryDAO;


  /**
   * 添加修改保存
   * @param categorys
   * @return
   */
  @Override
  public Result<List<Category>> save(List<Category> categorys) {

    Result results = new Result<List<Category>>();
    results.setSuccess(true);

    CategoryQueryParam param = new CategoryQueryParam();
    //获取历史类目数据
    List<Category> categoryList =this.query(param);

    Map<String, Category> categoryMapOld = new LinkedHashMap<>();
    //把List转换为Map对象
    for (Category categoryDO : categoryList) {
      Category category = new Category();
      categoryMapOld.put(categoryDO.getId(),category);
    }

    //新类目数据
    Map<String, Category> categoryMapNew = new LinkedHashMap<>();
    //把List转换为Map对象
    for (Category categoryNew : categorys) {
      Category category = new Category();
      categoryMapNew.put(categoryNew.getId(),category);
    }

    for (Category category:categorys
    ) {
      //判断类目是否存在
      if(categoryMapOld.containsKey(category.getId())){//存在
        //判断历史类目ID是否存在
        for (Category categoryl:categoryList
        ) {
          if(categoryMapNew.containsKey(categoryl.getId())){//存在，修改更新
            CategoryDO categoryDO = getCategoryDO(category);
            categoryDAO.update(categoryDO);
          }else{//不存在，删除
            categoryDAO.delete(categoryl.getId());
          }
        }
      }else{//不存在，增加insert
        CategoryDO categoryDO = getCategoryDO(category);
        categoryDAO.insert(categoryDO);

      }
    }
    results.setData(categorys);

    return results;
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
  public Result<Category> addOrUpdate(Category category) {
    return null;
  }

  @Override
  public Result<Media> add(Media media) {

    return null;
  }

  @Override
  public Result delete(String categoryId) {
    return null;
  }

  @Override
  public Result sort(List<Category> categorys) {
    return null;
  }
}
