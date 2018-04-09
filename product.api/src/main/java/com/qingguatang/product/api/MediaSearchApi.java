package com.qingguatang.product.api;

import com.qingguatang.product.model.Media;
import com.qingguatang.product.model.PagingData;
import com.qingguatang.product.param.MediaQueryParam;

/**
 * 多媒体查询API
 */
public interface MediaSearchApi {

  public PagingData<Media> query(MediaQueryParam param);

}
