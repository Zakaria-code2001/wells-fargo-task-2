package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Client {

    @Id
    @GeneratedValue()
    Long id;

    @Column(nullable = false)
    String name;

    @ManyToOne
    @JoinColumn(name = "advisor_id", nullable = false)
    private Advisor advisor;

    @OneToOne(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
    private Portfolio portfolio;

    public Client() {
    }

    public Client(Long id, String name, Advisor advisor) {
        this.id = id;
        this.name = name;
        this.advisor = advisor;
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

    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", advisor=" + advisor +
                '}';
    }
}
