package com.qingguatang.product.service;

import com.qingguatang.product.model.Media;
import com.qingguatang.product.model.Result;

/**
 * 多媒体操作服务
 * @author zhaopei
 * @date 2018/4/8
 */
public interface MediaService {

  /**
   * 添加
   * @param media
   * @return
   */
  public Result<Media> add(Media media);

  /**
   * 删除
   * @param mediaId
   * @return
   */
  public Result delete(String mediaId);
}
