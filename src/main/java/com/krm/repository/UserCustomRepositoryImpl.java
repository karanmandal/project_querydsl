package com.krm.repository;

import com.krm.domain.QUser;
import com.krm.domain.User;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserCustomRepositoryImpl implements UserCustomRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAll() {

        JPAQueryFactory queryFactory = new JPAQueryFactory(entityManager);

        return queryFactory.selectFrom(QUser.user).fetch();
    }
}
