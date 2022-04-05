package com.example.server.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @ClassName SongList
 * @Description TODO
 */
public class SongList {
    /**
     * 歌单id
     */
    private Integer id;
    /**
     * 歌单名
     */
    private String title;
    /**
     * 歌单图片
     */
    private String pic;
    /**
     * 歌单风格
     */
    private String style;
    /**
     * 歌单简介
     */
    private String introduction;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
