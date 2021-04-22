package com.api.annote.usecase;

import com.api.annote.gateway.database.entity.Annotation;
import com.api.annote.gateway.database.repository.AnnotationRepositoryFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class QueryAllAnnotations {
    private final AnnotationRepositoryFacade annotationRepositoryFacade;

    public List<Annotation> execute() {
        return annotationRepositoryFacade.findAll();
    }
}
