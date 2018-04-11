package com.qingguatang.product.dao;

import com.qingguatang.product.dataobject.CategoryDO;
import com.qingguatang.product.param.CategoryQueryParam;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryDAO {

    /**
     * 删除
     * @param id
     * @return
     */
    int delete(String id);

    /**
     * 添加插入
     * @param record
     * @return
     */
    int insert(CategoryDO record);


    /**
     * 查询
     * @return
     */
    List<CategoryDO> query(CategoryQueryParam param);

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    CategoryDO selectById(String id);

    /**
     * 更新修改
     * @param record
     * @return
     */
    int update(CategoryDO record);
}