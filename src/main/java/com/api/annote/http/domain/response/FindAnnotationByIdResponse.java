package com.api.annote.http.domain.response;

import com.api.annote.domain.AnnotationTO;

import lombok.Data;

@Data
public class FindAnnotationByIdResponse extends DefaultResponse {
    private AnnotationTO annotation;

    public AnnotationTO getAnnotation() {
        return annotation;
    }

    public void setAnnotation(AnnotationTO annotation) {
        this.annotation = annotation;
    }
}
