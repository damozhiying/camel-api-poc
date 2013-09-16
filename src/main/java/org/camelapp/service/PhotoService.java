package org.camelapp.service;

import org.camelapp.dao.PhotoDAO;
import org.camelapp.model.Photo;
import org.camelapp.model.PhotoBuilder;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class PhotoService {

    private PhotoDAO photoDAO;

    public void setPhotoDAO(PhotoDAO photoDAO) {
        this.photoDAO = photoDAO;
    }

    @Transactional
    public Photo getPhoto(String name) {
        Photo photo = new PhotoBuilder().setCaption("caption for " + name).setName(name).createPhoto();

        photoDAO.save(photo);

        List<Photo> photos = photoDAO.findAll();
        Photo retrievedPhoto = photos.get(photos.size() - 1);
        return retrievedPhoto;
    }
}
