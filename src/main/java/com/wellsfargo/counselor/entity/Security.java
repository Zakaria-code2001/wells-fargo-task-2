package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Security {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private LocalDate purchasePrice;

    @Column(nullable=false)
    private BigDecimal purchaseDate;

    @Column(nullable = false)
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "portfolio_id", nullable = false)
    private Portfolio portfolio;

    public Security() {
    }

    public Security(Long id, String name, String category, LocalDate purchasePrice, BigDecimal purchaseDate, Integer quantity, Portfolio portfolio) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
        this.portfolio = portfolio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(LocalDate purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public BigDecimal getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(BigDecimal purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
}
