package com.qingguatang.product.dao;

import com.qingguatang.product.dataobject.MediaDO;
import java.util.List;

public interface MediaDAO {

    /**
     * 删除
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 添加插入
     * @param record
     * @return
     */
    int insert(MediaDO record);

    /**
     * 查询
     * @param id
     * @return
     */
    MediaDO selectByPrimaryKey(Long id);

    /**
     * 查询所有
     * @return
     */
    List<MediaDO> selectAll();

    /**
     * 修改更新
     * @param record
     * @return
     */
    int updateByPrimaryKey(MediaDO record);
}