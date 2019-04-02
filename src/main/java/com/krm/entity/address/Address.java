package com.krm.entity.address;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long id;

    private String addressLineOne;
    private String addressLineTwo;
    private String province;

    @ManyToOne
    @JoinColumn(name = "zip_id")
    private Zip zip;

    @ManyToOne
    @JoinColumn(name = "state_id")
    private State state;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

}
