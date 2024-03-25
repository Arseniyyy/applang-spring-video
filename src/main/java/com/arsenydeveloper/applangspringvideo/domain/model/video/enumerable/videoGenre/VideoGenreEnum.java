package com.arsenydeveloper.applangspringvideo.domain.model.video.enumerable.videoGenre;

/**
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
public enum VideoGenreEnum {
    EDUCATIONAL("EDUCATIONAL"),
    ENTERTAINING("ENTERTAINING");

    private String code;

    private VideoGenreEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
