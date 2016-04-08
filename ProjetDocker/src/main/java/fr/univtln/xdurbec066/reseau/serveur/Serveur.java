package fr.univtln.xdurbec066.reseau.serveur;

/**
 * Created by xdurbec066 on 07/04/16.
 */

import com.sun.jersey.api.container.grizzly2.GrizzlyServerFactory;
import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.api.core.ResourceConfig;
import com.sun.net.httpserver.HttpServer;

import javax.ws.rs.core.UriBuilder;
import java.net.* ;
import java.io.* ;


public class Serveur {

    private static int getPort(int defaultPort) {
        //grab port from environment, otherwise fall back to default port 9998
        String httpPort = System.getProperty("jersey.test.port");
        if (null != httpPort) {
            try {
                return Integer.parseInt(httpPort);
            } catch (NumberFormatException e) {
            }
        }
        return defaultPort;
    }


    private static URI getBaseURI() {
        return UriBuilder.fromUri("http://localhost/").port(getPort(9998)).build();
    }


    public static final URI BASE_URI = getBaseURI();


    protected static org.glassfish.grizzly.http.server.HttpServer startServer() throws IOException {
        ResourceConfig resourceConfig = new PackagesResourceConfig("");

        System.out.println("Starting grizzly2...");
        return GrizzlyServerFactory.createHttpServer(BASE_URI, resourceConfig);
    }

    public static void main(String[] args) throws IOException {
        // Grizzly 2 initialization
        org.glassfish.grizzly.http.server.HttpServer httpServer = startServer();
        System.out.println(String.format("Jersey app started with WADL available at "
                        + "%sapplication.wadl\nHit enter to stop it...",
                BASE_URI));
        System.in.read();
        httpServer.stop();
    }
}
