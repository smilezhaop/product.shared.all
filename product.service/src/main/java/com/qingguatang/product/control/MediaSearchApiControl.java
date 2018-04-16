package com.qingguatang.product.control;

import com.qingguatang.product.api.MediaSearchApi;
import com.qingguatang.product.dao.MediaDAO;
import com.qingguatang.product.dataobject.MediaDO;
import com.qingguatang.product.model.Media;
import com.qingguatang.product.model.PagingData;
import com.qingguatang.product.param.MediaQueryParam;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MediaSearchApiControl implements MediaSearchApi{

  @Autowired
  private MediaDAO mediaDAO;

  @Override
  public PagingData<Media> query(MediaQueryParam param) {

    PagingData pagingDatas = new PagingData<Media>();

    List<MediaDO> mediaList = mediaDAO.query(param);

    pagingDatas.setTotalItems(mediaList.size());
    int perItem = 9;//每页显示9条
    pagingDatas.setTotalPages((mediaList.size()/perItem));
    pagingDatas.setData(mediaList);

    return pagingDatas;
  }
}
