package com.qingguatang.product.service.impl;

import com.qingguatang.product.dao.MediaDAO;
import com.qingguatang.product.dataobject.MediaDO;
import com.qingguatang.product.model.Media;
import com.qingguatang.product.model.Result;
import com.qingguatang.product.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MediaServiceImpl implements MediaService {

  @Autowired
  private MediaDAO mediaDAO;

  @Override
  public Result<Media> add(Media media) {
    MediaDO mediaDO = new MediaDO();
    mediaDO.setId(media.getId());
    mediaDO.setRefId(media.getRefId());
    mediaDO.setType(media.getType().toString());
    mediaDO.setUrl(media.getUrl());
    mediaDO.setAccountId(media.getAccountId());
    mediaDAO.insert(mediaDO);

    Result result = new Result<Media>();
    result.setSuccess(true);
    result.setData(media);
    return result;
  }

  @Override
  public Result delete(String mediaId) {
    int size = mediaDAO.deleteByPrimaryKey(Long.valueOf(mediaId));
    Result result = new Result();
    if (size == 1) {
      result.setSuccess(true);
    } else {
      result.setSuccess(false);
    }
    return result;
  }

}
