package org.camelapp.dao;

import org.camelapp.model.Photo;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;

// TODO: use Spring transaction managers.
// Currently methods DO NOT clean up after themselves.
public abstract class AbstractJpaDAO<T> {

    private Class<T> clazz;
    private EntityManagerFactory emf;

//    @PersistenceContext
//    private EntityManager entityManager;

    public void setClazz(Class<T> clazzToSet){
        this.clazz = clazzToSet;
    }

    @PersistenceUnit
    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
        this.emf = entityManagerFactory;
    }

//    public T findOne(Long id){
//        return this.entityManager.find(this.clazz, id);
//    }
//    public List<T> findAll(){
//        return this.entityManager.createQuery("from " + this.clazz.getName()).getResultList();
//    }


    public void save(T entity) {
        EntityManager entityManager = this.emf.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        entityManager.persist(entity);
        transaction.commit();

        entityManager.close();
    }

    public List<Photo> findAll() {
        EntityManager entityManager = this.emf.createEntityManager();

        List resultList = entityManager.createQuery("from " + this.clazz.getName()).getResultList();
        entityManager.close();

        return resultList;
    }

//    public void update(T entity){
//        this.entityManager.merge(entity);
//    }
//
//    public void delete(T entity){
//        this.entityManager.remove(entity);
//    }
//    public void deleteById(Long entityId){
//        T entity = this.findOne(entityId);
//
//        this.delete(entity);
//    }
}