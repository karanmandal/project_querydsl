package com.krm.repository;

import com.krm.entity.address.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long> {

    // Path: Address.Country.CountryName
    List<Address> findByCountryCountryName(String countryName);

    // Path: Address.State.StateName
    List<Address> findByStateStateName(String stateName);

    // Path: Address.Zip.zip
    List<Address> findByZipZipCode(Integer zipCode);
}
