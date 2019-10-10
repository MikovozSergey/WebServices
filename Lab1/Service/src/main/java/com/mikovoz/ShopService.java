package com.mikovoz;

import javax.ejb.EJB;
import javax.jws.WebService;

@WebService
public class ShopService {
    @EJB
    private ItemsDao itemsDao;
    @EJB
    private SellersDao sellersDao;

    public void addItem(Items items) {
        itemsDao.create(items);
    }

    public void addSeller(Sellers sellers) {
        sellersDao.create(sellers);
    }

    public Items getItem(Long id) {
        return itemsDao.findById(id);
    }

    public Sellers getSeller(Long id) {
        return sellersDao.findById(id);
    }

}
