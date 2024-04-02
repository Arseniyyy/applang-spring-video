package com.arsenydeveloper.applangspringvideo.adapters.spi.video.jpa;

import com.arsenydeveloper.applangspringvideo.application.spi.video.FindVideoByIdSpi;
import com.arsenydeveloper.applangspringvideo.domain.video.Video;
import com.arsenydeveloper.applangspringvideo.infrastructure.utils.converters.DataConverter;
import com.arsenydeveloper.applangspringvideo.application.dao.video.VideoRepository;
import com.arsenydeveloper.applangspringvideo.application.data.video.VideoData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
@Service
public class JpaClientFindVideoById implements FindVideoByIdSpi {

    @Autowired
    private VideoRepository videoRepository;

    @Autowired
    private DataConverter<Video, VideoData> dataConverter;

    @Override
    public VideoData findVideoById(UUID id) {
        Video instance = this.videoRepository.findById(id).get();

        return dataConverter.convert(instance);
    }
}
