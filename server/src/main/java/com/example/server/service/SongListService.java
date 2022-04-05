package com.example.server.service;

import com.example.server.domain.SongList;

import java.util.List;

public interface SongListService {
    /**
     * 新增歌单
     * @param songList
     * @return
     */
    boolean addSongList (SongList songList);

    /**
     * 更新歌单信息
     * @param songList
     * @return
     */
    boolean updateSongListMsg(SongList songList);

    /**
     * 更新歌单图片
     * @param songList
     * @return
     */
    boolean updateSongListImg(SongList songList);

    /**
     * 删除歌单
     * @param id
     * @return
     */
    boolean deleteSongList(Integer id);

    /**
     * 返回所有歌单
     * @return
     */
    List<SongList> allSongList();

    /**
     * 返回标题包含文字的歌单
     * @param title
     * @return
     */
    List<SongList> likeTitle(String title);

    /**
     * 根据歌单风格查找歌单
     * @param style
     * @return
     */
    List<SongList> likeStyle(String style);

    /**
     * 根据歌单名返回歌单
     * @param title
     * @return
     */
    List<SongList> songListOfTitle(String title);
}
