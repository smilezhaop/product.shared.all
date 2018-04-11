package com.qingguatang.product.dataobject;

import com.qingguatang.product.model.CategoryExtend;
import com.qingguatang.product.model.CategoryStatus;
import java.util.Date;

public class CategoryDO {
    private String id;

    /**创建时间*/
    private Date gmtCreated;

    /**修改时间*/
    private Date gmtModified;

    /**类目名称*/
    private String name;

    /**类目图片*/
    private String mediaId;

    /**类目状态*/
    private String status;

    /**类目顺序*/
    private Long sort;

    /**父类目ID*/
    private String parentCategoryId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**获取创建时间*/
    public Date getGmtCreated() {
        return gmtCreated;
    }

    /**设置创建时间*/
    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    /**获取修改时间*/
    public Date getGmtModified() {
        return gmtModified;
    }

    /**设置修改时间*/
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**获取类目名称*/
    public String getName() {
        return name;
    }

    /**设置类目名称*/
    public void setName(String name) {
        this.name = name;
    }

    /**获取类目图片*/
    public String getMediaId() {
        return mediaId;
    }

    /**设置类目图片*/
    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    /**获取类目状态*/
    public String getStatus() {
        return status;
    }

    /**设置类目状态*/
    public void setStatus(String status) {
        this.status = status;
    }

    /**获取类目顺序*/
    public Long getSort() {
        return sort;
    }

    /**设置类目顺序*/
    public void setSort(Long sort) {
        this.sort = sort;
    }

    /**获取父类目ID*/
    public String getParentCategoryId() {
        return parentCategoryId;
    }

    /**设置父类目ID*/
    public void setParentCategoryId(String parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }

    public CategoryExtend convert(){
        CategoryExtend categoryExtend = new CategoryExtend();
        categoryExtend.setId(getId());
        categoryExtend.setSort(getSort());
        categoryExtend.setName(getName());
        categoryExtend.setStatus(CategoryStatus.valueOf(getStatus()));
        categoryExtend.setMediaId(getMediaId());
        categoryExtend.setParentCategoryId(getParentCategoryId());
        return categoryExtend;
    }

}










