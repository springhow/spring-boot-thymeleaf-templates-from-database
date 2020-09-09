package com.springhow.examples.thymeleafdatabasetemplates.domain.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Template {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(unique = true)
    private String templateName;
    @Lob
    private String content;
}
