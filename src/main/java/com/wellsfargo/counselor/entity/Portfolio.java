package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Security> securities;

    public Portfolio() {
    }

    public Portfolio(Long id, Client client, List<Security> securities) {
        this.id = id;
        this.client = client;
        this.securities = securities;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }
}
