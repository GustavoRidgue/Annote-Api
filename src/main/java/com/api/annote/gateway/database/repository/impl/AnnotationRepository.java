package com.api.annote.gateway.database.repository.impl;

import com.api.annote.gateway.database.entity.Annotation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AnnotationRepository extends JpaRepository<Annotation, Long> {
    Optional<Annotation> findById(Long id);

    List<Annotation> findByTitle(String title);
}
