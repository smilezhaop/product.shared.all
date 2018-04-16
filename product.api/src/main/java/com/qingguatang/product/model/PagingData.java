package com.qingguatang.product.model;

/**
 * 统一返回集合模型：用于封装集合查询的结果
 * @author zhaopei
 * @date 2018/4/8
 */
public class PagingData<T> {

  //总条数
  private int totalItems;

  //总页数
  private int totalPages;

  //每页条数
  private int pageSize;

  //当前页
  private int currentPage;

  //数据
  private T data;

  public int getTotalItems() {
    return totalItems;
  }

  public void setTotalItems(int totalItems) {
    this.totalItems = totalItems;
  }

  public int getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(int totalPages) {
    this.totalPages = totalPages;
  }

  public int getPageSize() {
    return pageSize;
  }

  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
  }

  public int getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(int currentPage) {
    this.currentPage = currentPage;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }





}
