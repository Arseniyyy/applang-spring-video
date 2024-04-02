package com.arsenydeveloper.applangspringvideo.domain.video;

import com.arsenydeveloper.applangspringvideo.domain.tag.Tag;
import com.arsenydeveloper.applangspringvideo.domain.video.enumerable.difficultylevel.DifficultyLevelEnum;
import com.arsenydeveloper.applangspringvideo.domain.video.enumerable.videogenre.VideoGenreEnum;
import com.arsenydeveloper.applangspringvideo.domain.video.enumerable.videolanguage.VideoLanguageEnum;
import org.hibernate.validator.constraints.URL;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Past;
import jakarta.persistence.FetchType;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
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
    @Column(name = "title")
    private String title;

    @Column(name = "is_family_friendly")
    private Boolean isFamilyFriendly;

    @NotEmpty
    @Column(name = "description")
    private String description;

    @URL
    @NotEmpty
    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "duration")
    private Integer duration;

    @Past
    @Column(name = "publish_date")
    private LocalDate publishDate;

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

    @Column(name = "language")
    private VideoLanguageEnum language;

    @Column(name = "difficulty_level")
    private DifficultyLevelEnum difficultyLevel;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "video_tag",
        joinColumns = @JoinColumn(name = "video_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "tag_id", referencedColumnName = "id")
    )
    private Set<Tag> tags;

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

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }
}
