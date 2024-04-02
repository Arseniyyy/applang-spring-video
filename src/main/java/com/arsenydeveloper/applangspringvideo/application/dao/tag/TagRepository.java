package com.arsenydeveloper.applangspringvideo.application.dao.tag;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arsenydeveloper.applangspringvideo.domain.tag.Tag;

/**
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
public interface TagRepository extends JpaRepository<Tag, UUID> {}
