package com.arsenydeveloper.applangspringvideo.infrastructure.utils.converters.jpa.video.videogenre;

import com.arsenydeveloper.applangspringvideo.domain.video.enumerable.videogenre.VideoGenreEnum;
import jakarta.persistence.AttributeConverter;
import java.util.stream.Stream;

/**
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
class VideoGenreConverter implements AttributeConverter<VideoGenreEnum, String> {

    @Override
    public String convertToDatabaseColumn(VideoGenreEnum videoGenreEnum) {
        return videoGenreEnum.getCode();
    }

    @Override
    public VideoGenreEnum convertToEntityAttribute(String code) {
        return Stream.of(VideoGenreEnum.values())
            .filter(v -> v.getCode().equals(code))
            .findFirst()
            .orElseThrow(IllegalArgumentException::new);
    }
}
