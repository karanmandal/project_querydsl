package com.krm.repository.implementation;

import com.krm.entity.address.Address;
import com.krm.entity.address.QAddress;
import com.krm.repository.AddressRepository;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public abstract class AddressRepositoryImpl implements AddressRepository {

    @PersistenceContext
    private EntityManager entityManager;

    private JPAQueryFactory queryFactory;

    public AddressRepositoryImpl() {
        queryFactory = new JPAQueryFactory(entityManager);
    }

    @Override
    public List<Address> findByCountryCountryName(String countryName) {
        return queryFactory.selectFrom(QAddress.address).where(QAddress.address.country.countryName.eq(countryName)).fetch();
    }

    @Override
    public List<Address> findByStateStateName(String stateName) {
        return queryFactory.selectFrom(QAddress.address).where(QAddress.address.state.stateName.eq(stateName)).fetch();
    }

    @Override
    public List<Address> findByZipZipCode(Integer zipCode) {
        return queryFactory.selectFrom(QAddress.address).where(QAddress.address.zip.zipCode.eq(zipCode)).fetch();
    }
}
