package com.arsenydeveloper.applangspringvideo.application.api.usecases;

import com.arsenydeveloper.applangspringvideo.domain.model.video.Video;
import com.arsenydeveloper.applangspringvideo.application.api.FindVideoByIdApi;
import com.arsenydeveloper.applangspringvideo.application.spi.FindVideoByIdSpi;
import java.util.UUID;

/**
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
public class FindVideoByIdUseCase implements FindVideoByIdApi {

    private final FindVideoByIdSpi findVideoByIdSpi;

    public FindVideoByIdUseCase(FindVideoByIdSpi findVideoByIdSpi) {
        this.findVideoByIdSpi = findVideoByIdSpi;
    }

    @Override
    public Video findVideoById(UUID id) {
        return this.findVideoByIdSpi.findVideoById(id);
    }
}
