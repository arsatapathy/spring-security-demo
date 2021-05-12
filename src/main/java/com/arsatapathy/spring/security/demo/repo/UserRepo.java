package com.arsatapathy.spring.security.demo.repo;

import com.arsatapathy.spring.security.demo.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User, String> {
}
