package com.mikovoz;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ItemsDao {
    @PersistenceContext
    private EntityManager entityManager;

    public Items findById(Long id) {
        return entityManager.find(Items.class, id);
    }

    public void create(Items items){
        entityManager.persist(items);
    }
}
