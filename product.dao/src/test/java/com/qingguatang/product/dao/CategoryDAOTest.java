package com.qingguatang.product.dao;

import com.qingguatang.util.IDUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * CategoryDAOTest的描述:<br>
 *
 * @author apple 26/03/2018 2:26 PM
 */
@RunWith(SpringRunner.class)
@MybatisTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class CategoryDAOTest {

  private String id = IDUtil.get();

  @Test
  public void insertTest() {

  }


}
