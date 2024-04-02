package com.arsenydeveloper.applangspringvideo.application.data.tag;

import java.util.UUID;

/**
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
public class TagData {

    private UUID id;
    private String content;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
