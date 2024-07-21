package org.example.sportclubteam78.repository;

import org.example.sportclubteam78.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "SELECT * FROM users WHERE email = ?", nativeQuery = true)
    Optional<User> findByEmail(@Param("email") String email);

    @Override
    Optional<User> findById(Long Long);
}
