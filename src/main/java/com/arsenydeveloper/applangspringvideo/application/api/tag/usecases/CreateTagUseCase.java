package com.arsenydeveloper.applangspringvideo.application.api.tag.usecases;

import com.arsenydeveloper.applangspringvideo.application.api.tag.CreateTagApi;
import com.arsenydeveloper.applangspringvideo.application.data.tag.TagData;
import com.arsenydeveloper.applangspringvideo.application.spi.tag.CreateTagSpi;
import com.arsenydeveloper.applangspringvideo.domain.tag.Tag;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
public class CreateTagUseCase implements CreateTagApi {

    @Autowired
    private final CreateTagSpi createTagSpi;

    public CreateTagUseCase(CreateTagSpi createTagSpi) {
        this.createTagSpi = createTagSpi;
    }

    @Override
    public TagData create(Tag tag) {
        return this.createTagSpi.create(tag);
    }
}
