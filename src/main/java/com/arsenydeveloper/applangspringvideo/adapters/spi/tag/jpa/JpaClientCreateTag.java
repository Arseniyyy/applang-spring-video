package com.arsenydeveloper.applangspringvideo.adapters.spi.tag.jpa;

import com.arsenydeveloper.applangspringvideo.application.dao.tag.TagRepository;
import com.arsenydeveloper.applangspringvideo.application.data.tag.TagData;
import com.arsenydeveloper.applangspringvideo.application.spi.tag.CreateTagSpi;
import com.arsenydeveloper.applangspringvideo.domain.tag.Tag;
import com.arsenydeveloper.applangspringvideo.infrastructure.utils.converters.DataConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
@Service
public class JpaClientCreateTag implements CreateTagSpi {

    @Autowired
    private TagRepository repository;

    @Autowired
    private DataConverter<Tag, TagData> dataConverter;

    @Override
    public TagData create(Tag instance) {
        Tag savedInstance = this.repository.save(instance);

        return this.dataConverter.convert(savedInstance);
    }
}
