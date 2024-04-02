package com.arsenydeveloper.applangspringvideo.application.api.tag.usecases;

import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import com.arsenydeveloper.applangspringvideo.application.api.tag.FindTagByIdApi;
import com.arsenydeveloper.applangspringvideo.application.data.tag.TagData;
import com.arsenydeveloper.applangspringvideo.application.spi.tag.FindTagByIdSpi;

/**
 * FindTagByIdUseCase
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
public class FindTagByIdUseCase implements FindTagByIdApi {

    @Autowired
    private final FindTagByIdSpi findTagByIdSpi;

    public FindTagByIdUseCase(FindTagByIdSpi findTagByIdSpi) {
        this.findTagByIdSpi = findTagByIdSpi;
    }

    @Override
    public TagData findTagById(UUID id) {
        return this.findTagByIdSpi.findTagById(id);
    }
}
