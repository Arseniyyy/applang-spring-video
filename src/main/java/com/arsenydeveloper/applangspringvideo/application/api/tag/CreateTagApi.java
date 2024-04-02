package com.arsenydeveloper.applangspringvideo.application.api.tag;

import com.arsenydeveloper.applangspringvideo.application.data.tag.TagData;
import com.arsenydeveloper.applangspringvideo.domain.tag.Tag;

/**
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
@FunctionalInterface
public interface CreateTagApi {

    TagData create(Tag tag);
}
