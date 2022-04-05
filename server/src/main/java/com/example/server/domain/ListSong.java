package com.example.server.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @ClassName ListSongMapper
 * @Description TODO
 */
public class ListSong {
    /**
     * 歌曲歌单列表id
     */
    private Integer id;
    /**
     * 歌曲id
     */
    private Integer songId;
    /**
     * 歌单id
     */
    private Integer songListId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSongId() {
        return songId;
    }

    public void setSongId(Integer songId) {
        this.songId = songId;
    }

    public Integer getSongListId() {
        return songListId;
    }

    public void setSongListId(Integer songListId) {
        this.songListId = songListId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
