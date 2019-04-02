package com.krm.service;

import com.krm.entity.address.Address;

import java.util.List;

public interface AddressService {

    Address save(Address address);

    List<Address> findByCountry(String countryName);

    List<Address> findByState(String stateName);

    List<Address> findByZip(Integer zipCode);
}
