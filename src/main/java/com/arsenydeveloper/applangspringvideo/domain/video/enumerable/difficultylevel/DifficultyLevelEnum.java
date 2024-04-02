package com.arsenydeveloper.applangspringvideo.domain.video.enumerable.difficultylevel;

/**
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
public enum DifficultyLevelEnum {
    A1("A1"),
    A2("A2"),
    B1("B1"),
    B2("B2"),
    C1("C1"),
    C2("C2");

    private String code;

    private DifficultyLevelEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
