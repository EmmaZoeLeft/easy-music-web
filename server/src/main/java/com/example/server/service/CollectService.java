package com.example.server.service;

import com.example.server.domain.Collect;

import java.util.List;

public interface CollectService {
    /**
     * 新增收藏
     * @param collect
     * @return
     */
    boolean addCollection(Collect collect);

    /**
     * 验证是否已收藏
     * @param userId
     * @param songId
     * @return
     */
    boolean existSongId(Integer userId, Integer songId);

    /**
     * 更新收藏歌曲信息
     * @param collect
     * @return
     */
    boolean updateCollectMsg(Collect collect);

    /**
     * 删除收藏
     * @param userId
     * @param songId
     * @return
     */
    boolean deleteCollect(Integer userId, Integer songId);

    /**
     * 返回所有收藏
     * @return
     */
    List<Collect> allCollect();

    /**
     * 返回指定用户的收藏
     * @param userId
     * @return
     */
    List<Collect> collectionOfUser(Integer userId);

}
