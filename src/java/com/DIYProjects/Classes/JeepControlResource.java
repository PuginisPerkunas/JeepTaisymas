/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DIYProjects.Classes;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author root
 */
public class JeepControlResource {

    private String id;

    /**
     * Creates a new instance of JeepControlResource
     */
    private JeepControlResource(String id) {
        this.id = id;
    }

    /**
     * Get instance of the JeepControlResource
     */
    public static JeepControlResource getInstance(String id) {
        // The user may use some kind of persistence mechanism
        // to store and restore instances of JeepControlResource class.
        return new JeepControlResource(id);
    }

    /**
     * Retrieves representation of an instance of com.DIYProjects.Classes.JeepControlResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of JeepControlResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }

    /**
     * DELETE method for resource JeepControlResource
     */
    @DELETE
    public void delete() {
    }
}
