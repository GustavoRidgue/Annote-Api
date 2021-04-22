package com.api.annote.http.domain.buider;

import com.api.annote.domain.AnnotationTO;
import com.api.annote.gateway.database.entity.Annotation;
import org.springframework.stereotype.Component;

@Component
public class AnnotationBuilder {
    public AnnotationTO build(Annotation annotation){
        if(annotation == null) return null;

        AnnotationTO to = new AnnotationTO();
        to.setId(annotation.getId());
        to.setTitle(annotation.getTitle());
        to.setDescription(annotation.getDescription());
        to.setMessage(annotation.getMessage());
        to.setAlteredTime(annotation.getAlteredTime());
        to.setCreatedTIme(annotation.getCreatedTIme());
        to.setStatus(annotation.getStatus());
        to.setActive(annotation.getActive());

        return to;
    }
}
