package com.arsenydeveloper.applangspringvideo.domain.model.video.enumerable.videoLanguage;

/**
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
public enum VideoLanguageEnum {
    ENGLISH("ENGLISH"),
    RUSSIAN("RUSSIAN");

    private String code;

    private VideoLanguageEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
