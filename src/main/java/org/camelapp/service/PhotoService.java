package org.camelapp.service;

import org.camelapp.model.Photo;

public class PhotoService {

    public Photo getPhoto(String name) {
        Photo photo = new Photo();
        photo.setName(name + "-original.jpg");
        photo.setCaption("self portrait");
        return photo;
    }
}
