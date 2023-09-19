package com.picpaychallenge.picpaychallenge.repositories;

import com.picpaychallenge.picpaychallenge.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByDocument(String document);
}
