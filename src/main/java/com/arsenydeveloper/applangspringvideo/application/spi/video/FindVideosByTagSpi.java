package com.arsenydeveloper.applangspringvideo.application.spi.video;

import com.arsenydeveloper.applangspringvideo.application.data.video.VideoData;
import com.arsenydeveloper.applangspringvideo.domain.tag.Tag;
import java.util.List;

@FunctionalInterface
public interface FindVideosByTagSpi {

    List<VideoData> findVideosByTagSpi(Tag tag);
}
