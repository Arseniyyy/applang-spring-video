package com.arsenydeveloper.applangspringvideo.application.api.video;

import com.arsenydeveloper.applangspringvideo.application.data.video.VideoData;
import com.arsenydeveloper.applangspringvideo.domain.video.Video;

@FunctionalInterface
public interface CreateVideoApi {

    VideoData create(Video video);
}
