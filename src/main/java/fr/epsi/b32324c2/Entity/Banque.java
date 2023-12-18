package fr.epsi.b32324c2.Entity;

import org.mariadb.jdbc.client.Client;

import javax.persistence.*;
import java.util.List;

@Entity
public class Banque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;

    @OneToMany
    @JoinColumn(name = "client_id")
    private List<Client> client;

    public Banque() {
        // Constructeur par défaut
    }

    public Banque(List<Client> client, String name) {
        this.client = client;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Client> getClient() {
        return client;
    }

    public void setClient(List<Client> client) {
        this.client = client;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        // Implement your toString method if needed
        return "Banque{id=" + id + ", name='" + name + "', client=" + client + "}";
    }
}