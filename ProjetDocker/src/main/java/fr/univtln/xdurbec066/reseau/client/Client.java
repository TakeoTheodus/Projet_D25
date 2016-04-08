//package fr.univtln.xdurbec066.reseau.client;
//
//import com.sun.jersey.api.client.Client;
//import com.sun.jersey.api.client.WebResource;
//import fr.univtln.xdurbec066.reseau.objets.Utilisateur;
//import fr.univtln.xdurbec066.reseau.serveur.Serveur;
//
///**
// * Created by xdurbec066 on 07/04/16.
// */
//
//public class Client {
//
//    public static void main(String[] args) {
//        // create the client
//        //Client c = Client.create();
//        //WebResource webResource = c.resource(Serveur.BASE_URI);
//
//        //Send a get with a String as response
//        String responseAuteursAsJson = webResource.path().get(String.class);
//        System.out.println(responseAuteursAsJson);
//
//        //Idem but the result is deserialised to an instance of Auteur
//        Utilisateur utilisateur = webResource.path("objet/Utilisateur/1").get(Utilisateur.class);
//        System.out.println(utilisateur);
//
//        webResource.path("objet/Utilisateur").queryParam("nom","DUPOND").queryParam("prenom","Donalde").queryParam("adresse","DUPOND.donalde@gmail.fr").put();
//        System.out.println(webResource.path("objet/Utilisateur").get(String.class));
//    }
//
//
//}
