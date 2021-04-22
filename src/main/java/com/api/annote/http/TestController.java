package com.api.annote.http;

import com.api.annote.domain.AnnotationTO;
import com.api.annote.exception.AnnotationNotFoundException;
import com.api.annote.gateway.database.entity.Annotation;
import com.api.annote.gateway.database.repository.impl.AnnotationRepository;
import com.api.annote.http.domain.buider.AnnotationBuilder;
import com.api.annote.http.domain.response.FindAnnotationByIdResponse;
import com.api.annote.usecase.QueryAllAnnotations;
import com.api.annote.usecase.QueryAnnotationById;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class TestController {
    @Autowired
    private AnnotationRepository repository;

    private final QueryAllAnnotations queryAllAnnotations;
    private final QueryAnnotationById queryAnnotationById;
    private final AnnotationBuilder annotationBuilder;

    @GetMapping("test")
    @ResponseBody
    public String hello() {
        return "Hello World";
    }

    @GetMapping("api")
    @ResponseBody
    public List<Annotation> home() {
        return queryAllAnnotations.execute();
    }

    @GetMapping("api/{id}")
    @ResponseBody
    public FindAnnotationByIdResponse findById(@PathVariable("id") Long id) throws AnnotationNotFoundException {
        Annotation annotation = queryAnnotationById.execute(id);

        AnnotationTO annotationTO = annotationBuilder.build(annotation);

        FindAnnotationByIdResponse response = new FindAnnotationByIdResponse();
        response.setAnnotation(annotationTO);

        return response;
    }
}
