package com.arsenydeveloper.applangspringvideo.domain.model.video;

import com.arsenydeveloper.applangspringvideo.domain.model.video.enumerable.difficultyLevel.DifficultyLevelEnum;
import com.arsenydeveloper.applangspringvideo.domain.model.video.enumerable.videoGenre.VideoGenreEnum;
import com.arsenydeveloper.applangspringvideo.domain.model.video.enumerable.videoLanguage.VideoLanguageEnum;
import org.hibernate.validator.constraints.URL;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Past;
import java.util.Set;
import java.util.UUID;
import java.time.Duration;
import java.time.LocalDate;

/**
 * @author Arseniy Koshelnik
 * @since 0.0.1
 */
@Entity
@Table(name = "video")
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", unique = true, updatable = false)
    private UUID id;

    @NotEmpty
    @Column(name = "url")
    private String url;

    @NotEmpty
    @Column(name="title")
    private String title;

    @NotEmpty
    @Column(name = "description")
    private String description;

    @URL
    @NotEmpty
    @Column(name = "image_url")
    private String imageUrl;

    @NotEmpty
    @Column(name = "duration")
    private Duration duration;

    @Past
    @Column(name = "publish_date")
    private LocalDate publishDate;

    @NotEmpty
    @Column(name = "genre")
    private VideoGenreEnum genre;

    @URL
    @NotEmpty
    @Column(name = "author_link")
    private String authorUrl;

    @NotEmpty
    @Column(name = "author")
    private String author;

    @NotEmpty
    @Column(name="transcription")
    private String transcription;

    @NotEmpty
    @Column(name = "language")
    private VideoLanguageEnum language;

    @NotEmpty
    @Column(name = "difficulty_level")
    private DifficultyLevelEnum difficultyLevel;

    @NotEmpty
    @Column(name = "tag_words")
    private Set<UUID> tagWords;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
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
