package com.example.server.service;

import com.example.server.domain.Song;

import java.util.List;

public interface SongService {
    /**
     * 添加歌曲
     * @param song
     * @return
     */
    boolean addSong (Song song);

    /**
     * 更新歌曲信息
     * @param song
     * @return
     */
    boolean updateSongMsg(Song song);

    /**
     * 更新歌曲 URL
     * @param song
     * @return
     */
    boolean updateSongUrl(Song song);

    /**
     * 更新歌曲图片
     * @param song
     * @return
     */
    boolean updateSongPic(Song song);

    /**
     * 删除歌曲
     * @param id
     * @return
     */
    boolean deleteSong(Integer id);

    /**
     * 返回所有歌曲
     * @return
     */
    List<Song> allSong();

    /**
     * 根据指定歌手id返回歌曲
     * @param singerId
     * @return
     */
    List<Song> songOfSingerId(Integer singerId);

    /**
     * 根据歌曲id返回歌曲
     * @param id
     * @return
     */
    List<Song> songOfId(Integer id);

    /**
     * 根据指定歌手名返回歌曲
     * @param name
     * @return
     */
    List<Song> songOfSingerName(String name);

    /**
     * 根据歌曲名返回歌曲
     * @param name
     * @return
     */
    List<Song> songOfName(String name);
}
