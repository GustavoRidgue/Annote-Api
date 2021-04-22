package com.api.annote.gateway.database.repository.impl;

import com.api.annote.exception.AnnotationNotFoundException;
import com.api.annote.gateway.database.entity.Annotation;
import com.api.annote.gateway.database.repository.AnnotationRepositoryFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnnotationRepositoryFacadeImpl implements AnnotationRepositoryFacade {
    @Autowired
    private AnnotationRepository annotationRepository;

    @Override
    public Annotation findById(Long id) throws AnnotationNotFoundException {
        Optional<Annotation> optionalAnnotation = annotationRepository.findById(id);

        if (optionalAnnotation.isPresent()) {
            Annotation annotation = optionalAnnotation.get();
            return annotation;
        }
        throw new AnnotationNotFoundException((String.format("Nonexist annotation %d", id)));
    }

    @Override
    public List<Annotation> findAll() {
        return annotationRepository.findAll();
    }

    @Override
    public List<Annotation> findByTitle(String title) {
        return annotationRepository.findByTitle(title);
    }
}
