package com.qingguatang.product.control;

import com.qingguatang.product.api.MediaSearchApi;
import com.qingguatang.product.dao.MediaDAO;
import com.qingguatang.product.dataobject.MediaDO;
import com.qingguatang.product.model.Media;
import com.qingguatang.product.model.PagingData;
import com.qingguatang.product.param.MediaQueryParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class MediaSearchApiControl implements MediaSearchApi {

  @Autowired
  private MediaDAO mediaDAO;

  @Override
  public PagingData<Media> query(@RequestBody(required = false) MediaQueryParam param) {

    PagingData pagingDatas = new PagingData<Media>();

    List<MediaDO> mediaList = mediaDAO.selectAll();

    pagingDatas.setTotalItems(mediaList.size());
    int perItem = 9;//每页显示9条
    pagingDatas.setTotalPages((mediaList.size() / perItem)+1);

    List<Media> medias = new ArrayList<>();
    //转换do-model
    for (MediaDO mediaDO : mediaList) {
      Media media = mediaDO.convert();
      medias.add(media);
    }

    pagingDatas.setData(medias);

    return pagingDatas;
  }
}
