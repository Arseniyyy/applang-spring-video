package com.arsenydeveloper.applangspringvideo.application.api.video.usecases;

import com.arsenydeveloper.applangspringvideo.application.api.video.FindVideosByTagApi;
import com.arsenydeveloper.applangspringvideo.application.data.video.VideoData;
import com.arsenydeveloper.applangspringvideo.application.spi.video.FindVideosByTagSpi;
import com.arsenydeveloper.applangspringvideo.domain.tag.Tag;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
public class FindVideosByTagUseCase implements FindVideosByTagApi {

    @Autowired
    private final FindVideosByTagSpi findVideosByTagSpi;

    public FindVideosByTagUseCase(FindVideosByTagSpi findVideosByTagSpi) {
        this.findVideosByTagSpi = findVideosByTagSpi;
    }

    @Override
    public List<VideoData> findVideosByTagApi(Tag tag) {
        return this.findVideosByTagSpi.findVideosByTagSpi(tag);
    }
}
