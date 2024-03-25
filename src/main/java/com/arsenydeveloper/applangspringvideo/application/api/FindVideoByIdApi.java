package com.arsenydeveloper.applangspringvideo.application.api;

import com.arsenydeveloper.applangspringvideo.domain.model.video.Video;
import java.util.UUID;

/**
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
public interface FindVideoByIdApi {
    Video findVideoById(UUID id);
}
