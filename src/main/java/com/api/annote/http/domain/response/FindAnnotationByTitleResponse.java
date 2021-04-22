package com.api.annote.http.domain.response;

import com.api.annote.domain.AnnotationTO;
import lombok.Data;

@Data
public class FindAnnotationByTitleResponse extends DefaultResponse {
    private AnnotationTO annotation;
}
