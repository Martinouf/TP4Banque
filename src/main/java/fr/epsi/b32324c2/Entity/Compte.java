package fr.epsi.b32324c2.Entity;

import javax.persistence.*;
import java.util.List;


@Entity
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numero;
    private double solde;

    @ManyToMany
    @JoinColumn(name = "client_id")
    private List<Client> client;

    @OneToMany(mappedBy = "compte")
    private List<Operation> operations;

    public Compte() {
    }

    public Compte(Long id, String numero, double solde, List<Client> client, List<Operation> operations) {
        this.id = id;
        this.numero = numero;
        this.solde = solde;
        this.client = client;
        this.operations = operations;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public List<Client> getClient() {
        return client;
    }

    public void setClient(List<Client> client) {
        this.client = client;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                ", solde=" + solde +
                ", clients=" + client +
                ", operations=" + operations +
                '}';
    }
}