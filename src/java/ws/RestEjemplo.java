/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

/**
 * REST Web Service
 *
 * @author ESTACION
 */
@Path("rest")
public class RestEjemplo {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of RestEjemplo
     */
    public RestEjemplo() {
    }

    @GET
    @Path("{angulo}")
    @Produces("text/html")
    public String calcularSeno(@PathParam("angulo") int angulo){
        double res = Math.sin(Math.PI*angulo/180.0);
        String salida = "<!DOCTYPE html>"
                + "<html>"
                + "<head>"
                + "</head>"
                + "<body>"
                + "<h1>"
                + res
                + "</h1>"
                + "</body>"
                + "</html>";
        return salida;
    }
    
}
