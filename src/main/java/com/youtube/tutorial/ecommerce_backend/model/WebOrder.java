package com.youtube.tutorial.ecommerce_backend.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="web_order")
public class WebOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name="user_id", nullable = false)
    private LocalUser user;

    @ManyToOne(optional = false)
    @JoinColumn(name="address_id", nullable = false)
    private Address address;

    @OneToMany(mappedBy = "order", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<WebOrderQuantities> quatities=new ArrayList<>();



    public WebOrder(Long id, LocalUser user, Address address, List<WebOrderQuantities> quatities) {
        this.id = id;
        this.user = user;
        this.address = address;
        this.quatities = quatities;
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

    public List<WebOrderQuantities> getQuatities() {
        return quatities;
    }

    public void setQuatities(List<WebOrderQuantities> quatities) {
        this.quatities = quatities;
    }
}
