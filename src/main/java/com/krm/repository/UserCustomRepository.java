package com.krm.repository;

import com.krm.domain.User;

import java.util.List;

public interface UserCustomRepository {

    List<User> getAll();

}
