package com.youtube.tutorial.ecommerce_backend.model;

import jakarta.persistence.*;

@Entity
@Table(name="address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "address_line_1", length = 512)
    private String addressLine1;

    @Column(name="address_line_2", length = 512)
    private String addressLine2;

    @Column(name="city", nullable = false)
    private String City;

    @Column(name="country", nullable = false, length = 75)
    private String country;

    @ManyToOne
    @JoinColumn(name="user_id", nullable = false)
    private LocalUser user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", City='" + City + '\'' +
                ", country='" + country + '\'' +
                ", user=" + user +
                '}';
    }
}
