package com.qingguatang.product.dao;

import static org.assertj.core.api.Assertions.assertThat;

import com.qingguatang.product.dataobject.CategoryDO;
import com.qingguatang.product.param.CategoryQueryParam;
import com.qingguatang.util.IDUtil;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Category测试
 *
 * @author zp 2018/4/16
 */
@RunWith(SpringRunner.class)
@MybatisTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class CategoryDAOTest {

  private String id = IDUtil.get();

  @Autowired
  private CategoryDAO categoryDAO;

  @Test
  public void insertTest() {
    CategoryDO categoryDO = new CategoryDO();
    categoryDO.setId(id);
    categoryDO.setName("工具类");
    categoryDO.setMediaId("0012");
    categoryDO.setStatus("ENABLED");
    categoryDO.setSort(02l);
    categoryDO.setParentCategoryId("");

    int size = categoryDAO.insert(categoryDO);

    assertThat(size).isGreaterThan(0);
  }

  @Test
  public void queryTest(){
    CategoryQueryParam param = new CategoryQueryParam();
    param.setName("工具类");

    List<CategoryDO> categoryDOList = categoryDAO.query(param);
    assertThat(categoryDOList.size()).isEqualTo(0);

  }

}
