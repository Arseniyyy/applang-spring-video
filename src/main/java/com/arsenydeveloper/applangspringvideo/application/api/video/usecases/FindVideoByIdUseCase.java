package com.arsenydeveloper.applangspringvideo.application.api.video.usecases;

import com.arsenydeveloper.applangspringvideo.application.api.video.FindVideoByIdApi;
import com.arsenydeveloper.applangspringvideo.application.data.video.VideoData;
import com.arsenydeveloper.applangspringvideo.application.spi.video.FindVideoByIdSpi;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
public class FindVideoByIdUseCase implements FindVideoByIdApi {

    @Autowired
    private final FindVideoByIdSpi findVideoByIdSpi;

    public FindVideoByIdUseCase(FindVideoByIdSpi findVideoByIdSpi) {
        this.findVideoByIdSpi = findVideoByIdSpi;
    }

    @Override
    public VideoData findVideoById(UUID id) {
        return this.findVideoByIdSpi.findVideoById(id);
    }
}
