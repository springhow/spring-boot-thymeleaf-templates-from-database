package com.springhow.examples.thymeleafdatabasetemplates;

import com.springhow.examples.thymeleafdatabasetemplates.domain.entities.Template;
import com.springhow.examples.thymeleafdatabasetemplates.domain.repositories.TemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootThymeleafTemplatesFromDatabaseApplication implements CommandLineRunner {

    @Autowired
    private TemplateRepository templateRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootThymeleafTemplatesFromDatabaseApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Template template1 = new Template();
        template1.setTemplateName("db-bronze");
        template1.setContent("<h1> Hello Bronze user</h1>");
        templateRepository.save(template1);
        Template template2 = new Template();
        template2.setTemplateName("db-silver");
        template2.setContent("<h1> Hello Silver user</h1>");
        templateRepository.save(template2);
        Template template3 = new Template();
        template3.setTemplateName("db-gold");
        template3.setContent("<h1> Hello Gold user</h1>");
        templateRepository.save(template3);
        Template template4 = new Template();
        template4.setTemplateName("db-platinum");
        template4.setContent("<h1> Hello Platinum user</h1>");
        templateRepository.save(template4);
    }
}
