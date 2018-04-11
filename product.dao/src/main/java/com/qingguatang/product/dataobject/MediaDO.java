package com.qingguatang.product.dataobject;

public class MediaDO {
    private Long id;

    /**关联资源ID*/
    private String refId;

    /**资源类型*/
    private String type;

    /**资源url*/
    private String url;

    /**资源上传者账户ID*/
    private String accountId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**获取关联资源ID*/
    public String getRefId() {
        return refId;
    }

    /**设置关联资源ID*/
    public void setRefId(String refId) {
        this.refId = refId;
    }

    /**获取资源类型*/
    public String getType() {
        return type;
    }

    /**设置资源类型*/
    public void setType(String type) {
        this.type = type;
    }

    /**获取资源url*/
    public String getUrl() {
        return url;
    }

    /**设置资源url*/
    public void setUrl(String url) {
        this.url = url;
    }

    /**获取资源上传者账户ID*/
    public String getAccountId() {
        return accountId;
    }

    /**设置资源上传者账户ID*/
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
}