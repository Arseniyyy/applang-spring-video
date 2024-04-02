package com.arsenydeveloper.applangspringvideo.application.api.tag;

import com.arsenydeveloper.applangspringvideo.application.data.tag.TagData;
import java.util.List;

/**
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
@FunctionalInterface
public interface FindAllTagsApi {

    List<TagData> findAllTags();
}
