package me.dio.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity(name = "tb_card")
public class Card {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String number;
    @Column(name= "available_limit", precision = 13, scale = 2)
    private BigDecimal limit;

    // Construtor padrão necessário para JPA
    public Card() {
        // Construtor vazio necessário para o funcionamento do JPA/Hibernate
    }

    // Construtor
    public Card(String number, BigDecimal limit) {
        this.number = number;
        this.limit = limit;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
}
