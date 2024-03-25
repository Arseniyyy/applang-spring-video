package com.arsenydeveloper.applangspringvideo.domain.model.video.enumerable.videoLanguage;

import jakarta.persistence.AttributeConverter;
import java.util.stream.Stream;

/**
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
class VideoLanguageConverter implements AttributeConverter<VideoLanguageEnum, String> {

    @Override
    public String convertToDatabaseColumn(VideoLanguageEnum videoLanguageEnum) {
        return videoLanguageEnum.getCode();
    }

    @Override
    public VideoLanguageEnum convertToEntityAttribute(String code) {
        return Stream.of(VideoLanguageEnum.values())
            .filter(v -> v.getCode().equals(code))
            .findFirst()
            .orElseThrow(IllegalArgumentException::new);
    }
}
