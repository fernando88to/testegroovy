package com.fernando

import com.fernando.services.MyService
import groovy.transform.CompileStatic
import groovy.transform.PackageScope
import jakarta.inject.Inject
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType

/**
 * Classe de alguma coisa
 */
@CompileStatic
@Path('/teste')
class TesteResource {


    @Inject
    @PackageScope
    MyService myService

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    Map<String, String> index() {
        Map<String, String> retorno = [mensagen:'oi luan']
        return retorno
    }

    @Path('/nome')
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    Map<String, String> index2() {
        String nome = myService.meuNome()
        Map<String, String> retorno = [nome:nome]
        return retorno
    }

}
