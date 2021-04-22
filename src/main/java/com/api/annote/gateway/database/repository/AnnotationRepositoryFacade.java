package com.api.annote.gateway.database.repository;

import com.api.annote.exception.AnnotationNotFoundException;
import com.api.annote.gateway.database.entity.Annotation;

import java.util.List;

public interface AnnotationRepositoryFacade {
    public List<Annotation> findAll();
    public Annotation findById(Long id) throws AnnotationNotFoundException;
    public List<Annotation> findByTitle(String title);
}
