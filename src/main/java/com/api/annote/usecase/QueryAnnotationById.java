package com.api.annote.usecase;

import com.api.annote.exception.AnnotationNotFoundException;
import com.api.annote.gateway.database.entity.Annotation;
import com.api.annote.gateway.database.repository.AnnotationRepositoryFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class QueryAnnotationById {
    private AnnotationRepositoryFacade annotationRepositoryFacade;

    public Annotation execute(Long id) throws AnnotationNotFoundException {
        return annotationRepositoryFacade.findById(id);
    }
}
