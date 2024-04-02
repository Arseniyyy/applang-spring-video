package com.arsenydeveloper.applangspringvideo.adapters.api.video.spring.webmvc;

import com.arsenydeveloper.applangspringvideo.adapters.api.video.spring.webmvc.presentation.VideoPresentationV1;
import com.arsenydeveloper.applangspringvideo.application.api.video.CreateVideoApi;
import com.arsenydeveloper.applangspringvideo.application.api.video.FindVideoByIdApi;
import com.arsenydeveloper.applangspringvideo.application.data.video.VideoData;
import com.arsenydeveloper.applangspringvideo.domain.video.Video;
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
 * VideoRestController
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
@RestController
public class VideoRestController {

    @Autowired
    private final FindVideoByIdApi findVideoByIdApi;

    @Autowired
    private final CreateVideoApi createVideoApi;

    @Autowired
    private final DataConverter<VideoData, VideoPresentationV1> dataConverter;

    public VideoRestController(
            FindVideoByIdApi findVideoByIdApi,
            CreateVideoApi createVideoApi,
            DataConverter<VideoData, VideoPresentationV1> dataConverter
    ) {
        this.findVideoByIdApi = findVideoByIdApi;
        this.createVideoApi = createVideoApi;
        this.dataConverter = dataConverter;
    }

    @GetMapping(
        value = "${info.api.video-endpoint}/{id}",
        produces = MediaType.APPLICATION_JSON_VALUE
    )
        public ResponseEntity<VideoPresentationV1> getDetailVideo(@PathVariable UUID id) {
            VideoData videoData = this.findVideoByIdApi.findVideoById(id);
            VideoPresentationV1 videoPresentationV1 = this.dataConverter.convert(videoData);

            return ResponseEntity.ok().body(videoPresentationV1);
        }

    @PostMapping(
        value = "${info.api.video-endpoint}",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<VideoPresentationV1> createVideo(@RequestBody @Valid Video body) {
        VideoData videoData = this.createVideoApi.create(body);
        VideoPresentationV1 videoPresentationV1 = this.dataConverter.convert(videoData);

        return new ResponseEntity<>(videoPresentationV1, HttpStatus.CREATED);
    }
}
