package com.arsenydeveloper.applangspringvideo.application.dao.video;

import com.arsenydeveloper.applangspringvideo.domain.video.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

/**
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
public interface VideoRepository extends JpaRepository<Video, UUID> {
}
