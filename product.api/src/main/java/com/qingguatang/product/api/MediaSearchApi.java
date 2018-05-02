package com.qingguatang.product.api;

import com.qingguatang.product.model.Media;
import com.qingguatang.product.model.PagingData;
import com.qingguatang.product.param.MediaQueryParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 多媒体查询API
 * @author zhaopei
 * @date 2018/4/8
 */
public interface MediaSearchApi {

  @RequestMapping(path = "api/media/query" ,produces = "application/json")
  @ResponseBody
  public PagingData<Media> query(MediaQueryParam param);

}
