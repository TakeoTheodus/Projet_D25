package fr.univtln.xdurbec066.reseau;

import fr.univtln.xdurbec066.reseau.objets.Utilisateur;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Created by xdurbec066 on 14/03/16.
 */
public class Test1 {
    public static void main( String[] args ) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("h2-eclipselink");
        EntityManager em = emf.createEntityManager();

        Utilisateur u1 = new Utilisateur("Bernard","DelaDevalier","uneadresse@hotmail.be");

        EntityTransaction transaction= em.getTransaction();
       transaction.begin();
        em.persist(u1);
        transaction.commit();


    }


}
