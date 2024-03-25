package com.arsenydeveloper.applangspringvideo.domain.model.tag;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;

/**
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
@Entity
@Table(name = "video_tag")
public class VideoTag {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", unique = true, updatable = false)
    private UUID id;

    @Column(name = "content")
    private String content;
}
