package me.dio.domain.model;

import jakarta.persistence.Entity;

@Entity(name = "tb_news")
public class News extends BaseItem {

    // Construtor padrão necessário para JPA
    public News() {
        // Construtor vazio necessário para o funcionamento do JPA/Hibernate
    }
}
