package com.qingguatang.product.control;

import com.qingguatang.product.api.CategoryApi;
import com.qingguatang.product.dao.CategoryDAO;
import com.qingguatang.product.dao.MediaDAO;
import com.qingguatang.product.dataobject.CategoryDO;
import com.qingguatang.product.model.Category;

import com.qingguatang.product.model.Media;
import com.qingguatang.product.model.Result;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author zhaopei
 * @date 2018/4/9
 */
@Controller
public class CategoryApiControl implements CategoryApi {

  @Autowired
  private CategoryDAO categoryDAO;
  @Autowired
  private MediaDAO mediaDAO;

  /**
   * 添加修改保存
   * @param categorys
   * @return
   */
  @Override
  public Result<List<Category>> save(List<Category> categorys) {


    //得到新类目数据
    for (Category category:categorys
    ) {
      CategoryDO categoryDO = new CategoryDO();
      categoryDO.setId(category.getId());
      categoryDO.setName(category.getName());
      categoryDO.setMediaId(category.getMediaId());
      categoryDO.setStatus(category.getStatus().toString());
      categoryDO.setSort(category.getSort());
      categoryDO.setParentCategoryId(category.getParentCategoryId());
      //对新类目名称非法验证


      //查询历史数据
      String categoryId = category.getId();
      //遍历类目，判断是否存在
      if (categoryDAO.selectById(categoryId)==null){
        //不存在，添加
        categoryDAO.insert(categoryDO);
        //添加关联media


      }else{
        //存在 修改更新
        categoryDAO.update(categoryDO);

      }
    }

    return null;
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
