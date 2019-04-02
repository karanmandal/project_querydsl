package com.krm.controller;

import com.krm.entity.address.Address;
import com.krm.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class MainController {

    @Autowired
    private AddressService addressService;

    @PostMapping("/save-address")
    public ResponseEntity saveAddress(@RequestBody Address address) {
        return ResponseEntity.ok(addressService.save(address));
    }

    @GetMapping("/all-address-of-country/{countryName}")
    public ResponseEntity findAddressByCountry(@PathVariable String countryName) {
        return ResponseEntity.ok(addressService.findByCountry(countryName));
    }

    @GetMapping("/all-address-of-state/{stateName}")
    public ResponseEntity findAddressByState(@PathVariable String stateName) {
        return ResponseEntity.ok(addressService.findByState(stateName));
    }

    @GetMapping("/all-address-of-zip/{zipCode}")
    public ResponseEntity findAddressByZip(@PathVariable Integer zipCode) {
        return ResponseEntity.ok(addressService.findByZip(zipCode));
    }

}
