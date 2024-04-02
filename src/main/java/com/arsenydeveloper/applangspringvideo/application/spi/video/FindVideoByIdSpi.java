package com.arsenydeveloper.applangspringvideo.application.spi.video;

import com.arsenydeveloper.applangspringvideo.application.data.video.VideoData;
import java.util.UUID;

/**
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
@FunctionalInterface
public interface FindVideoByIdSpi {

    VideoData findVideoById(UUID id);
}
