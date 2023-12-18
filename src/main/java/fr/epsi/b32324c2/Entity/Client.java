package fr.epsi.b32324c2.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Embedded
    private Adresse adresse;
    private String nom;
    private String prenom;
    private String dateNaissance;

    @ManyToMany(mappedBy = "client")
    private List<Compte> comptes;

    @ManyToOne()
    @JoinColumn(name = "name_banque")
    private Banque banque;

    // Constructeurs
    public Client() {
        // Constructeur par défaut
    }

    public Client(String nom, String prenom, Adresse adresse, String dateNaissance, Banque banque) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.dateNaissance = dateNaissance;
        this.banque = banque;
    }

    // Getters et setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(List<Compte> comptes) {
        this.comptes = comptes;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Banque getBanque() {
        return banque;
    }

    public void setBanque(Banque banque) {
        this.banque = banque;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", adresse=" + adresse +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance='" + dateNaissance + '\'' +
                ", comptes=" + comptes + '\'' +
                ", banque=" + banque +
                '}';
    }
}