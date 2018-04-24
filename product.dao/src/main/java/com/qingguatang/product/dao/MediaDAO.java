package com.qingguatang.product.dao;

import com.qingguatang.product.dataobject.MediaDO;
import com.qingguatang.product.param.MediaQueryParam;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MediaDAO {

  /**
   * 删除
   */
  int deleteByPrimaryKey(Long id);

  /**
   * 添加插入
   */
  int insert(MediaDO record);

  /**
   * 根据ID查询
   */
  MediaDO selectByPrimaryKey(Long id);

  /**
   * 根据参数查询
   */
  List<MediaDO> query(MediaQueryParam param);

  /**
   *
   * @param record
   * @return
   */
  int updateByPrimaryKey(MediaDO record);
}