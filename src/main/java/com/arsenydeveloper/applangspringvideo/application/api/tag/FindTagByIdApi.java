package com.arsenydeveloper.applangspringvideo.application.api.tag;

import java.util.UUID;
import com.arsenydeveloper.applangspringvideo.application.data.tag.TagData;

/**
 * FindTagByIdApi
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
@FunctionalInterface
public interface FindTagByIdApi {

    TagData findTagById(UUID id);
}
