package com.api.annote.domain;

import com.api.annote.gateway.database.entity.AnnotationStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AnnotationTO {
    private Long id;
    private String title;
    private String description;
    private String message;
    private LocalDateTime alteredTime;
    private LocalDateTime createdTIme;
    private AnnotationStatus status;
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
