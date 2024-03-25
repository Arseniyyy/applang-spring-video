package com.arsenydeveloper.applangspringvideo.application.data.video;

import com.arsenydeveloper.applangspringvideo.domain.model.video.enumerable.difficultyLevel.DifficultyLevelEnum;
import com.arsenydeveloper.applangspringvideo.domain.model.video.enumerable.videoGenre.VideoGenreEnum;
import com.arsenydeveloper.applangspringvideo.domain.model.video.enumerable.videoLanguage.VideoLanguageEnum;
import java.util.UUID;
import java.time.LocalDate;
import java.util.Set;

/**
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
public class VideoData {

    private String id;
    private String url;
    private String title;
    private String description;
    private String imageUrl;
    private String duration;
    private LocalDate publishDate;
    private VideoGenreEnum genre;
    private String authorUrl;
    private String author;
    private String transcription;
    private VideoLanguageEnum language;
    private DifficultyLevelEnum difficultyLevel;
    private Set<UUID> tagWords;

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

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
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

    public Set<UUID> getTagWords() {
        return tagWords;
    }

    public void setTagWords(Set<UUID> tagWords) {
        this.tagWords = tagWords;
    }
}
