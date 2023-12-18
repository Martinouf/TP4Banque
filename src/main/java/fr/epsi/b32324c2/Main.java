package fr.epsi.b32324c2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Banque1");
        EntityManager em = emf.createEntityManager();
        em.close();
        emf.close();
    }
}