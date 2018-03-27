package com.qingguatang.util;

import java.util.UUID;

/**
 * ID工具类
 *
 * @author joe
 * @date 2018/1/23
 */
public class IDUtil {

  /**
   * 获取唯一ID
   */
  public static String get() {
    return UUID.randomUUID().toString().replaceAll("-", "");
  }

}
