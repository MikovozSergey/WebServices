package com.mikovoz;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Sellers {
    private Long id;
    private String name;
    private Collection<Items> sellersById;

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

    @OneToMany(mappedBy = "sellersBySellersId")
    public Collection<Items> getSellersById() {
        return sellersById;
    }

    public void setSellersById(Collection<Items> sellersById) {
        this.sellersById = sellersById;
    }
}
