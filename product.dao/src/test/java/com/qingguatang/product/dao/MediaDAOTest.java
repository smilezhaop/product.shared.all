package com.qingguatang.product.dao;

import static org.assertj.core.api.Assertions.assertThat;

import com.qingguatang.product.dataobject.MediaDO;
import com.qingguatang.util.IDUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * MediaTest
 *
 * @author zp 2018/4/16
 */
@RunWith(SpringRunner.class)
@MybatisTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class MediaDAOTest {

  private String id = IDUtil.get();

  @Autowired
  private MediaDAO mediaDAO;

  @Test
  public void insertTest() {
    MediaDO mediaDO = new MediaDO();
    mediaDO.setId(1112l);
    mediaDO.setRefId("0112");
    mediaDO.setType("IMAGE");
    mediaDO.setUrl("http://www.qgt.com");
    mediaDO.setAccountId("zp001");

    int size = mediaDAO.insert(mediaDO);

    assertThat(size).isGreaterThan(0);
  }

  @Test
  public void queryTest(){

  }

}
