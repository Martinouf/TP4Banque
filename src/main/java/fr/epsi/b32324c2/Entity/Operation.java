package fr.epsi.b32324c2.Entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String motif;
    private double montant;
    private LocalDateTime date;

    @ManyToOne
    @JoinColumn(name = "compte_id")
    private Compte compte;

    public Operation() {
        // Constructeur par défaut
    }

    public Operation(Compte compte, String motif, double montant, LocalDateTime date) {
        this.compte = compte;
        this.motif = motif;
        this.montant = montant;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "id=" + id +
                ", motif='" + motif + '\'' +
                ", montant=" + montant +
                ", date=" + date +
                ", compte=" + compte +
                '}';
    }
}