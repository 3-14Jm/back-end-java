package com.fox.service;

import com.fox.domain.User;
import com.fox.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserService extends AbstractService<User, Integer> {
    public UserRepository userRepository;

    @Override
    protected JpaRepository<User, Integer> getRepository() {
        return userRepository;
    }
}
