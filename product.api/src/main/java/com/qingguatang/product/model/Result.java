package com.qingguatang.product.model;

/**
 * 统一返回模型，用于封装事务操作的结果
 */
public class Result<T> {

  private boolean isSuccess;

  private String code;

  private String message;

  private T data;

  public boolean isSuccess() {
    return isSuccess;
  }

  public void setSuccess(boolean success) {
    isSuccess = success;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }
}
