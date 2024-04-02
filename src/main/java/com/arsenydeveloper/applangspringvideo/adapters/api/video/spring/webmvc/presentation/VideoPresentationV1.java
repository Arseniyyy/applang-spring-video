package com.arsenydeveloper.applangspringvideo.adapters.api.video.spring.webmvc.presentation;

import com.arsenydeveloper.applangspringvideo.domain.video.enumerable.difficultylevel.DifficultyLevelEnum;
import com.arsenydeveloper.applangspringvideo.domain.video.enumerable.videogenre.VideoGenreEnum;
import com.arsenydeveloper.applangspringvideo.domain.video.enumerable.videolanguage.VideoLanguageEnum;
import com.arsenydeveloper.applangspringvideo.application.data.tag.TagData;
import java.time.LocalDate;
import java.util.Set;

/**
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
public class VideoPresentationV1 {

    private String id;
    private String url;
    private String title;
    private Boolean isFamilyFriendly;
    private String description;
    private String imageUrl;
    private Integer duration;
    private LocalDate publishDate;
    private VideoGenreEnum genre;
    private String authorUrl;
    private String author;
    private String transcription;
    private VideoLanguageEnum language;
    private DifficultyLevelEnum difficultyLevel;
    private Set<TagData> tags;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getIsFamilyFriendly() {
        return isFamilyFriendly;
    }

    public void setIsFamilyFriendly(Boolean isFamilyFriendly) {
        this.isFamilyFriendly = isFamilyFriendly;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public VideoGenreEnum getGenre() {
        return genre;
    }

    public void setGenre(VideoGenreEnum genre) {
        this.genre = genre;
    }

    public String getAuthorUrl() {
        return authorUrl;
    }

    public void setAuthorUrl(String authorUrl) {
        this.authorUrl = authorUrl;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTranscription() {
        return transcription;
    }

    public void setTranscription(String transcription) {
        this.transcription = transcription;
    }

    public VideoLanguageEnum getLanguage() {
        return language;
    }

    public void setLanguage(VideoLanguageEnum language) {
        this.language = language;
    }

    public DifficultyLevelEnum getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(DifficultyLevelEnum difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public Set<TagData> getTags() {
        return tags;
    }

    public void setTags(Set<TagData> tags) {
        this.tags = tags;
    }
}
