package com.arsenydeveloper.applangspringvideo.application.spi;

import com.arsenydeveloper.applangspringvideo.domain.model.video.Video;
import java.util.UUID;

/**
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
public interface FindVideoByIdSpi {
    Video findVideoById(UUID id);
}
