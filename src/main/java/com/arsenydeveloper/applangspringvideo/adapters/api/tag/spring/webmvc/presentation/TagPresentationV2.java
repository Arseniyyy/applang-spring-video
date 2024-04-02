package com.arsenydeveloper.applangspringvideo.adapters.api.tag.spring.webmvc.presentation;

import com.arsenydeveloper.applangspringvideo.application.data.video.VideoData;
import java.util.Set;
import java.util.UUID;

/**
 * TagPresentationV2
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
public class TagPresentationV2 {

    private UUID id;
    private String content;
    private Set<VideoData> videos;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Set<VideoData> getVideos() {
        return videos;
    }

    public void setVideos(Set<VideoData> videos) {
        this.videos = videos;
    }
}
