package com.arsenydeveloper.applangspringvideo.application.spi.tag;

import com.arsenydeveloper.applangspringvideo.application.data.tag.TagData;
import com.arsenydeveloper.applangspringvideo.domain.tag.Tag;

/**
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
@FunctionalInterface
public interface CreateTagSpi {

    TagData create(Tag tag);
}
