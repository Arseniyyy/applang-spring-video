package com.arsenydeveloper.applangspringvideo.adapters.api.tag.spring.webmvc;

import com.arsenydeveloper.applangspringvideo.adapters.api.tag.spring.webmvc.presentation.TagPresentationV1;
import com.arsenydeveloper.applangspringvideo.adapters.api.tag.spring.webmvc.presentation.TagPresentationV2;
import com.arsenydeveloper.applangspringvideo.application.api.tag.CreateTagApi;
import com.arsenydeveloper.applangspringvideo.application.api.tag.FindTagByIdApi;
import com.arsenydeveloper.applangspringvideo.application.data.tag.TagData;
import com.arsenydeveloper.applangspringvideo.domain.tag.Tag;
import com.arsenydeveloper.applangspringvideo.infrastructure.utils.converters.DataConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;
import java.util.UUID;

/**
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
@RestController
public class TagRestController {

    @Autowired
    private final FindTagByIdApi findTagByIdApi;

    @Autowired
    private final CreateTagApi createTagApi;

    @Autowired
    private final DataConverter<TagData, TagPresentationV1> converterV1;

    @Autowired
    private final DataConverter<TagData, TagPresentationV2> converterV2;

    public TagRestController(
        FindTagByIdApi findTagByIdApi,
        CreateTagApi createTagApi,
        DataConverter<TagData, TagPresentationV1> converterV1,
        DataConverter<TagData, TagPresentationV2> converterV2
    ) {
        this.findTagByIdApi = findTagByIdApi;
        this.createTagApi = createTagApi;
        this.converterV1 = converterV1;
        this.converterV2 = converterV2;
    }

    @GetMapping(
        value = "${info.api.tag-endpoint}/{id}",
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<TagPresentationV2> getDetailTag(@PathVariable UUID id) {
        TagData instance = this.findTagByIdApi.findTagById(id);
        TagPresentationV2 presentationV1 = this.converterV2.convert(instance);

        return ResponseEntity.ok().body(presentationV1);
    }

    @PostMapping(
        value = "${info.api.tag-endpoint}",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<TagPresentationV1> createTag(@Valid @RequestBody Tag body) {
        TagData tagData = this.createTagApi.create(body);
        TagPresentationV1 tagPresentationV1 = this.converterV1.convert(tagData);

        return new ResponseEntity<>(tagPresentationV1, HttpStatus.CREATED);
    }
}
