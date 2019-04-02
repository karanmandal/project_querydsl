package com.krm.service.implementation;

import com.krm.entity.address.Address;
import com.krm.repository.AddressRepository;
import com.krm.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public Address save(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public List<Address> findByCountry(String countryName) {
        return addressRepository.findByCountryCountryName(countryName);
    }

    @Override
    public List<Address> findByState(String stateName) {
        return addressRepository.findByStateStateName(stateName);
    }

    @Override
    public List<Address> findByZip(Integer zipCode) {
        return addressRepository.findByZipZipCode(zipCode);
    }

}
