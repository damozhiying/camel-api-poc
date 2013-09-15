package org.camelapp.restapi;

import org.camelapp.model.Photo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/photos")
@Produces(MediaType.APPLICATION_JSON)
public class PhotoResource {

    @GET
    @Path("/{name}")
    public Photo getPhoto(@PathParam("name") String name) {
        return null;
    }
}
