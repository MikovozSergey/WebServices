package com.mikovoz;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class SellersDao {
    @PersistenceContext
    private EntityManager entityManager;

    public Sellers findById(Long id) {
        return entityManager.find(Sellers.class, id);
    }

    public void create(Sellers items) {
        entityManager.persist(items);
    }
}
