package com.springhow.examples.thymeleafdatabasetemplates.domain.repositories;

import com.springhow.examples.thymeleafdatabasetemplates.domain.entities.Template;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemplateRepository extends JpaRepository<Template, Integer> {

    Template findByTemplateName(String templateName);

}
