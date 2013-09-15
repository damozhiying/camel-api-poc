package org.camelapp.dao;

import org.camelapp.model.Photo;
import org.camelapp.model.PhotoBuilder;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;

//@Repository
public class PhotoDAO extends AbstractJpaDAO<Photo> {
    public PhotoDAO() {
        setClazz(Photo.class);
    }

}