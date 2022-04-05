package com.example.server.service;

import com.example.server.domain.ListSong;

import java.util.List;

public interface ListSongService {
    /**
     * 新增歌曲歌单关系
     * @param listSong
     * @return
     */
    boolean addListSong(ListSong listSong);

    /**
     * 更新歌曲歌单信息
     * @param listSong
     * @return
     */
    boolean updateListSongMsg(ListSong listSong);

    /**
     * 删除歌曲歌单关系
     * @param songId
     * @return
     */
    boolean deleteListSong(Integer songId);

    /**
     * 返回所有歌曲歌单关系
     * @return
     */
    List<ListSong> allListSong();

    /**
     * 返回指定歌曲的歌曲歌单关系
     * @param songListId
     * @return
     */
    List<ListSong> listSongOfSongId(Integer songListId);
}
