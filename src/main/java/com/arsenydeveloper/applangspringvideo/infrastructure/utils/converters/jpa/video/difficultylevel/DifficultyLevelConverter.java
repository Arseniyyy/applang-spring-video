package com.arsenydeveloper.applangspringvideo.infrastructure.utils.converters.jpa.video.difficultylevel;

import com.arsenydeveloper.applangspringvideo.domain.video.enumerable.difficultylevel.DifficultyLevelEnum;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import java.util.stream.Stream;

/**
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
@Converter(autoApply = true)
class DifficultyLevelConverter implements AttributeConverter<DifficultyLevelEnum, String> {

    @Override
    public String convertToDatabaseColumn(DifficultyLevelEnum difficultyLevelEnum) {
        return difficultyLevelEnum.getCode();
    }

    @Override
    public DifficultyLevelEnum convertToEntityAttribute(String code) {
        return Stream.of(DifficultyLevelEnum.values())
            .filter(v -> v.getCode().equals(code))
            .findFirst()
            .orElseThrow(IllegalArgumentException::new);
    }
}
