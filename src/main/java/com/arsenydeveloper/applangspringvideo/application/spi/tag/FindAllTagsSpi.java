package com.arsenydeveloper.applangspringvideo.application.spi.tag;

import com.arsenydeveloper.applangspringvideo.application.data.tag.TagData;
import java.util.List;

/**
 * FindAllTagsSpi
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
@FunctionalInterface
public interface FindAllTagsSpi {

    List<TagData> findAllTags();
}
