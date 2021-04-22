package com.api.annote.http;

import com.api.annote.domain.AnnotationTO;
import com.api.annote.exception.AnnotationNotFoundException;
import com.api.annote.gateway.database.entity.Annotation;
import com.api.annote.http.domain.buider.AnnotationBuilder;
import com.api.annote.http.domain.response.FindAnnotationByIdResponse;
import com.api.annote.usecase.QueryAnnotationById;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(URLMapping.ROOT_API_WS_ANNOTATIONS)
@Api(tags = "Annotations")
@RequiredArgsConstructor
public class AnnotationWS {

    private QueryAnnotationById queryAnnotationById;
    private AnnotationBuilder annotationBuilder;


    @ApiOperation(value = "Find annotation by ID")
    @GetMapping
    public FindAnnotationByIdResponse findById(@PathVariable(name = "id") Long id) throws AnnotationNotFoundException {

        Annotation annotation = queryAnnotationById.execute(id);

        AnnotationTO annotationTO = annotationBuilder.build(annotation);

        FindAnnotationByIdResponse response = new FindAnnotationByIdResponse();
        response.setAnnotation(annotationTO);

        return response;
    }

}
