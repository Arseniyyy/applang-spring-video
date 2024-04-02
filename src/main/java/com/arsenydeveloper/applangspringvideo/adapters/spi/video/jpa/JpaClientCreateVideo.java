package com.arsenydeveloper.applangspringvideo.adapters.spi.video.jpa;

import com.arsenydeveloper.applangspringvideo.application.dao.video.VideoRepository;
import com.arsenydeveloper.applangspringvideo.application.data.video.VideoData;
import com.arsenydeveloper.applangspringvideo.application.spi.video.CreateVideoSpi;
import com.arsenydeveloper.applangspringvideo.domain.video.Video;
import com.arsenydeveloper.applangspringvideo.infrastructure.utils.converters.DataConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
@Service
public class JpaClientCreateVideo implements CreateVideoSpi {

    @Autowired
    private VideoRepository repository;

    @Autowired
    private DataConverter<Video, VideoData> dataConverter;

    @Override
    public VideoData create(Video entity) {
        Video instance = this.repository.save(entity);

        return this.dataConverter.convert(instance);
    }
}
