package com.qingguatang.product.dao;

import static org.assertj.core.api.Assertions.assertThat;

import com.qingguatang.product.dataobject.ProductDO;
import java.util.Date;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * product测试
 *
 * @author zhaopei
 * @date 2018/5/4
 */
@RunWith(SpringRunner.class)
@MybatisTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class ProductDAOTest {

  @Autowired
  private ProductDAO productDAO;

  /**
   * 初始化数据
   */
  @Before
  public void init() {
    ProductDO productDO = new ProductDO();
    productDO.setId("p001");
    productDO.setTitle("test");
    productDO.setAccountId("zp01");
    productDO.setCategoryId("A002");
    productDO.setDescription("testProductDO 001");
    productDO.setMainPictUrl("http://qwetrewr");
    productDO.setShowPrice("100");
    productDO.setLinePrice("99");
    productDO.setProductCode("01");
    productDO.setOnlineTime(new Date());
    productDO.setOfflineTime(new Date());
    productDAO.insert(productDO);

    productDO = new ProductDO();
    productDO.setId("p002");
    productDO.setTitle("test");
    productDO.setAccountId("zp01");
    productDO.setCategoryId("A003");
    productDO.setDescription("testProductDO 002");
    productDO.setMainPictUrl("http://trewtrew");
    productDO.setShowPrice("200");
    productDO.setLinePrice("199");
    productDO.setProductCode("02");
    productDO.setOnlineTime(new Date());
    productDO.setOfflineTime(new Date());
    productDAO.insert(productDO);

  }

  @Test
  public void insertTest() {

    ProductDO productDO = new ProductDO();
    productDO.setId("p001");
    productDO.setTitle("test");
    productDO.setAccountId("zp01");
    productDO.setCategoryId("A002");
    productDO.setDescription("testProductDO insert");
    productDO.setMainPictUrl("http://qwer");
    productDO.setShowPrice("100");
    productDO.setLinePrice("99");
    productDO.setProductCode("01");
    productDO.setOnlineTime(new Date());
    productDO.setOfflineTime(new Date());

    int size = productDAO.insert(productDO);
    assertThat(size).isGreaterThan(0);

  }

  @Test
  public void queryTest() {

    ProductDO productDO = productDAO.selectByKey("p002");
    assertThat(productDO.getTitle().compareTo("test"));
  }

  @Test
  public void updateTest() {
    ProductDO productDO = new ProductDO();
    productDO.setId("p001");
    productDO.setTitle("testUpdate");
    productDO.setAccountId("zp01");
    productDO.setCategoryId("A002");
    productDO.setDescription("testProductDO insert");
    productDO.setMainPictUrl("http://qwer");
    productDO.setShowPrice("100");
    productDO.setLinePrice("99");
    productDO.setProductCode("01");
    productDO.setOnlineTime(new Date());
    productDO.setOfflineTime(new Date());

    int size = productDAO.updateByKey(productDO);
    assertThat(size).isGreaterThan(0);
  }

}
