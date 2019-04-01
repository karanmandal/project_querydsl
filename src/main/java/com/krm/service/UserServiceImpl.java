package com.krm.service;

import com.krm.domain.User;
import com.krm.repository.UserCustomRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserCustomRepository userCustomRepository;

    @Override
    public List<User> getAll() {
        return userCustomRepository.getAll();
    }

}
