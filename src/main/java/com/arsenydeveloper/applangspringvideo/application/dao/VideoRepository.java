package com.arsenydeveloper.applangspringvideo.application.dao;

import com.arsenydeveloper.applangspringvideo.domain.model.video.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

/**
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
public interface VideoRepository extends JpaRepository<Video, UUID> {
}
