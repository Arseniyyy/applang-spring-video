package com.arsenydeveloper.applangspringvideo.infrastructure.utils.converters;

import com.arsenydeveloper.applangspringvideo.adapters.api.tag.spring.webmvc.presentation.TagPresentationV1;
import com.arsenydeveloper.applangspringvideo.adapters.api.video.spring.webmvc.presentation.VideoPresentationV1;
import com.arsenydeveloper.applangspringvideo.application.data.tag.TagData;
import com.arsenydeveloper.applangspringvideo.application.data.video.VideoData;
import com.arsenydeveloper.applangspringvideo.domain.tag.Tag;
import com.arsenydeveloper.applangspringvideo.domain.video.Video;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * DataConverter
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
@Component
public class DataConverter<T, P> {

    @Autowired
    private ModelMapper mapper;

    /**
     * @param toBeConverted
     * @return
     */
    @SuppressWarnings("unchecked")
    public P convert(T toBeConverted) {
        if (toBeConverted instanceof Video) {
            VideoData videoData = new VideoData();
            mapper.map(toBeConverted, videoData);

            return (P) videoData;
        } else if (toBeConverted instanceof VideoData) {
            VideoPresentationV1 videoPresentationV1 = new VideoPresentationV1();
            mapper.map(toBeConverted, videoPresentationV1);

            return (P) videoPresentationV1;
        } else if (toBeConverted instanceof Tag) {
            TagData tagData = new TagData();
            mapper.map(toBeConverted, tagData);

            return (P) tagData;
        } else if (toBeConverted instanceof TagData) {
            TagPresentationV1 tagPresentationV1 = new TagPresentationV1();
            mapper.map(toBeConverted, tagPresentationV1);

            return (P) tagPresentationV1;
        }

        throw new IllegalArgumentException("Unsupported conversion type: " + toBeConverted.getClass());
    }
}
