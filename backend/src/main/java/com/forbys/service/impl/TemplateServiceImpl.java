package com.forbys.service.impl;

import com.forbys.dto.request.TemplateRequestDTO;
import com.forbys.entities.Template;
import com.forbys.repository.TemplateRepository;
import com.forbys.service.TemplateService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class TemplateServiceImpl implements TemplateService {

    private final TemplateRepository templateRepository;

    @Override
    public void createTemplate(TemplateRequestDTO templateRequestDTO) {
        Template template = new Template();

        BeanUtils.copyProperties(templateRequestDTO, template);

        templateRepository.save(template);
    }
}
