package com.arsenydeveloper.applangspringvideo.application.api.video.usecases;

import com.arsenydeveloper.applangspringvideo.application.api.video.CreateVideoApi;
import com.arsenydeveloper.applangspringvideo.application.data.video.VideoData;
import com.arsenydeveloper.applangspringvideo.application.spi.video.CreateVideoSpi;
import com.arsenydeveloper.applangspringvideo.domain.video.Video;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
public class CreateVideoUseCase implements CreateVideoApi {

    @Autowired
    private final CreateVideoSpi createVideoSpi;

    public CreateVideoUseCase(CreateVideoSpi createVideoSpi) {
        this.createVideoSpi = createVideoSpi;
    }

    @Override
    public VideoData create(Video video) {
        return this.createVideoSpi.create(video);
    }
}
