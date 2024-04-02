package com.arsenydeveloper.applangspringvideo.adapters.api.tag.spring.webmvc.presentation;

import java.util.UUID;

/**
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
public class TagPresentationV1 {

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
