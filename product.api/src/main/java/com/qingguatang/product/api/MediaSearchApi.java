package com.qingguatang.product.api;

import com.qingguatang.product.model.Media;
import com.qingguatang.product.model.PagingData;
import com.qingguatang.product.param.MediaQueryParam;

/**
 * 多媒体查询API
 * @author zhaopei
 * @date 2018/4/8
 */
public interface MediaSearchApi {

  public PagingData<Media> query(MediaQueryParam param);

}
