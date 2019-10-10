package com.mikovoz;

import javax.persistence.*;

@Entity
public class Items {
    private Long id;
    private String name;
    private Long sellersId;
    private Sellers sellersBySellersId;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name ="sellers_id")
    public Long getSellersId() {
        return sellersId;
    }

    public void setSellersId(Long sellersId) {
        this.sellersId = sellersId;
    }

    @ManyToOne
    @JoinColumn(name = "sellers_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public Sellers getSellersBySellersId() {
        return sellersBySellersId;
    }

    public void setSellersBySellersId(Sellers sellersBySellersId) {
        this.sellersBySellersId = sellersBySellersId;
    }
}
