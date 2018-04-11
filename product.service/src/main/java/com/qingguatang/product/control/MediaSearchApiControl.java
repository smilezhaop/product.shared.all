package com.qingguatang.product.control;

import com.qingguatang.product.api.MediaSearchApi;
import com.qingguatang.product.model.Media;
import com.qingguatang.product.model.PagingData;
import com.qingguatang.product.param.MediaQueryParam;

public class MediaSearchApiControl implements MediaSearchApi{

  @Override
  public PagingData<Media> query(MediaQueryParam param) {
    return null;
  }
}
