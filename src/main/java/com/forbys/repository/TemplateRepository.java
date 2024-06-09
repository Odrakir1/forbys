package com.forbys.repository;

import com.forbys.entities.Template;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TemplateRepository extends JpaRepository<Template, Long> {
}
