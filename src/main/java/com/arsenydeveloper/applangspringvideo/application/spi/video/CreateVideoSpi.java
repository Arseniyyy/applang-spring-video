package com.arsenydeveloper.applangspringvideo.application.spi.video;

import com.arsenydeveloper.applangspringvideo.application.data.video.VideoData;
import com.arsenydeveloper.applangspringvideo.domain.video.Video;

/**
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
@FunctionalInterface
public interface CreateVideoSpi {

    VideoData create(Video video);
}
