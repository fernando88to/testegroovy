package com.fernando

import groovy.transform.CompileStatic
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType

/**
 * Classe de alguma coisa
 */
@CompileStatic
@Path('/oi')
class TesteResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    Map<String, String> index() {
        Map<String, String> retorno = [mensagen:'oi luan']
        return retorno
    }

    @Path('/2')
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    Map<String, String> index2() {
        Map<String, String> retorno = [teste:'oi luan']
        return retorno
    }

}
