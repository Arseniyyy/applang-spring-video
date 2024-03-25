package com.arsenydeveloper.applangspringvideo.adapters.spi.jpa;

import java.util.UUID;

import com.arsenydeveloper.applangspringvideo.application.spi.FindVideoByIdSpi;
import com.arsenydeveloper.applangspringvideo.domain.model.video.Video;

public class JpaClientFindVideoById implements FindVideoByIdSpi {

    private VideoRepository videoRepository;

    @Override
    public Video findVideoById(UUID id) {
    }
}
