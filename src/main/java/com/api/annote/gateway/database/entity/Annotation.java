package com.api.annote.gateway.database.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_annotation")
public class Annotation {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "annotation_id")
    private Long id;

    @Column(name = "annotation_title")
    private String title;

    @Column(name = "annotation_description")
    private String description;

    @Column(name = "annotation_message")
    private String message;

    @Column(name = "annotation_alteredTime")
    private LocalDateTime alteredTime;

    @Column(name = "annotation_createdTIme")
    private LocalDateTime createdTIme;

    @Column(name = "annotation_status")
    @Enumerated(EnumType.STRING)
    private AnnotationStatus status;

    @Column(name = "annotation_active")
    private Boolean active;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getAlteredTime() {
        return alteredTime;
    }

    public void setAlteredTime(LocalDateTime alteredTime) {
        this.alteredTime = alteredTime;
    }

    public LocalDateTime getCreatedTIme() {
        return createdTIme;
    }

    public void setCreatedTIme(LocalDateTime createdTIme) {
        this.createdTIme = createdTIme;
    }

    public AnnotationStatus getStatus() {
        return status;
    }

    public void setStatus(AnnotationStatus status) {
        this.status = status;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
