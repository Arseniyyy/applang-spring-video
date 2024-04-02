package com.arsenydeveloper.applangspringvideo.application.api.video;

import com.arsenydeveloper.applangspringvideo.application.data.video.VideoData;
import com.arsenydeveloper.applangspringvideo.domain.tag.Tag;
import java.util.List;

/**
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
@FunctionalInterface
public interface FindVideosByTagApi {

    List<VideoData> findVideosByTagApi(Tag tag);
}
