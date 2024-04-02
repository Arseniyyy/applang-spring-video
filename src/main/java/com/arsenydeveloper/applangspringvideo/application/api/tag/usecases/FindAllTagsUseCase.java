package com.arsenydeveloper.applangspringvideo.application.api.tag.usecases;

import com.arsenydeveloper.applangspringvideo.application.api.tag.FindAllTagsApi;
import com.arsenydeveloper.applangspringvideo.application.data.tag.TagData;
import com.arsenydeveloper.applangspringvideo.application.spi.tag.FindAllTagsSpi;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 * FindAllTagsUseCase
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
public class FindAllTagsUseCase implements FindAllTagsApi {

    @Autowired
    private FindAllTagsSpi findAllTagsSpi;

    @Override
    public List<TagData> findAllTags() {
        return this.findAllTagsSpi.findAllTags();
    }
}
