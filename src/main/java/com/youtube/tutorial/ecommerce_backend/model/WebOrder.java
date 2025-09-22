package com.youtube.tutorial.ecommerce_backend.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "web_order")
public class WebOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private  Long id;
    /** The user of the order*/

    @ManyToOne(optional = false)
    @JoinColumn(name="user_id", nullable = false)
    private LocalUser user;

    /*The shipping address of the order */
    @ManyToOne(optional = false)
    @JoinColumn(name="address_id", nullable = false)
    private Address address;

    /*The quantities ordered */
    @OneToMany(mappedBy = "order", cascade=CascadeType.REMOVE, orphanRemoval = true)
    private List<WebOrderedQuantities> quantities=new ArrayList<>();

    public WebOrder(Long id, LocalUser user, Address address, List<WebOrderedQuantities> quantities) {
        this.id = id;
        this.user = user;
        this.address = address;
        this.quantities = quantities;
    }

    public WebOrder(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalUser getUser() {
        return user;
    }

    public void setUser(LocalUser user) {
        this.user = user;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<WebOrderedQuantities> getQuantities() {
        return quantities;
    }

    public void setQuantities(List<WebOrderedQuantities> quantities) {
        this.quantities = quantities;
    }
}
