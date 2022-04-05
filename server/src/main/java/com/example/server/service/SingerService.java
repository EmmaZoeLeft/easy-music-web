package com.example.server.service;

import com.example.server.domain.Singer;

import java.util.List;

public interface SingerService {
    /**
     * 新增歌手
     * @param singer
     * @return
     */
    boolean addSinger (Singer singer);

    /**
     * 更细歌手信息
     * @param singer
     * @return
     */
    boolean updateSingerMsg(Singer singer);

    /**
     * 更新歌手照片
     * @param singer
     * @return
     */
    boolean updateSingerPic(Singer singer);

    /**
     * 删除歌手
     * @param id
     * @return
     */
    boolean deleteSinger(Integer id);

    /**
     * 返回所有歌手
     * @return
     */
    List<Singer> allSinger();

    /**
     * 根据歌手名查找歌手
     * @param name
     * @return
     */
    List<Singer> singerOfName(String name);

    /**
     * 根据歌手性别查找歌手
     * @param sex
     * @return
     */
    List<Singer> singerOfSex(Integer sex);
}
