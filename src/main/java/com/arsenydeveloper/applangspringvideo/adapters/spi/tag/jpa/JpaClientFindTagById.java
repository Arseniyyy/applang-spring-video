package com.arsenydeveloper.applangspringvideo.adapters.spi.tag.jpa;

import com.arsenydeveloper.applangspringvideo.application.dao.tag.TagRepository;
import com.arsenydeveloper.applangspringvideo.application.data.tag.TagData;
import com.arsenydeveloper.applangspringvideo.application.spi.tag.FindTagByIdSpi;
import com.arsenydeveloper.applangspringvideo.domain.tag.Tag;
import com.arsenydeveloper.applangspringvideo.infrastructure.utils.converters.DataConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.UUID;

/**
 * JpaClientFindTagById
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
@Service
public class JpaClientFindTagById implements FindTagByIdSpi {

    @Autowired
    private TagRepository repository;

    @Autowired
    private DataConverter<Tag, TagData> converter;

    @Override
    public TagData findTagById(UUID id) {
        Tag instance = this.repository.findById(id).get();
        return this.converter.convert(instance);
    }
}
