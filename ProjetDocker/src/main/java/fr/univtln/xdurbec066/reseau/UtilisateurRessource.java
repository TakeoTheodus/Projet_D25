package fr.univtln.xdurbec066.reseau;


import fr.univtln.xdurbec066.reseau.objets.Utilisateur;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * Created by Takeo on 06/04/2016.
 */

@Path("/objets")
public class UtilisateurRessource {

    @GET
    @Path("/{id}")
//    @Produces("plain-text")
    public Response get(@PathParam("id") long id) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("h2-eclipselink");
        EntityManager em = emf.createEntityManager();
        Utilisateur personne = em.find(Utilisateur.class,id);
        return Response.ok(personne).build();
    }



    @POST
    public Response post(Utilisateur utilisateur) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("h2-eclipselink");
        EntityManager em = emf.createEntityManager();

        Utilisateur u1 = new Utilisateur(utilisateur);

        return Response.ok(u1).build();
    }




}


