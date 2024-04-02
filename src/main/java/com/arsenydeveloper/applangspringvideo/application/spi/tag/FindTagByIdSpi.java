package com.arsenydeveloper.applangspringvideo.application.spi.tag;

import com.arsenydeveloper.applangspringvideo.application.data.tag.TagData;
import java.util.UUID;

/**
 * FindTagByIdSpi
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
@FunctionalInterface
public interface FindTagByIdSpi {

    TagData findTagById(UUID id);
}
