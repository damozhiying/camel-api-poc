package org.camelapp.soapapi;

import org.camelapp.model.Photo;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface PhotoEndpoint {
    @WebResult(name = "photo")
    public Photo getPhoto(@WebParam(name = "name") String name);
}
