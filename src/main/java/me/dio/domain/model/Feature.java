package me.dio.domain.model;

import jakarta.persistence.Entity;

@Entity(name = "tb_feature")
public class Feature extends BaseItem {

    // Construtor padrão necessário para JPA
    public Feature() {
        // Construtor vazio necessário para o funcionamento do JPA/Hibernate
    }
}