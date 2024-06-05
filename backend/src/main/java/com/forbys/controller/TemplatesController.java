package com.forbys.controller;

import com.forbys.dto.request.TemplateRequestDTO;
import com.forbys.service.TemplateService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "${uri.v1.forbys.mapping.templates}")
@Slf4j
public class TemplatesController {

    private final TemplateService templateService;

    @PostMapping
    @ResponseStatus(code = HttpStatus.OK)
    public ResponseEntity<?> createTemplate(@RequestBody TemplateRequestDTO templateRequestDTO){
        System.out.println(templateRequestDTO);
        templateService.createTemplate(templateRequestDTO);

        return ResponseEntity.ok().build();
    }
}
