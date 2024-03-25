package com.example.springtoken.Repository;

import com.example.springtoken.Entity.OurUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface OurUsersRepository extends JpaRepository<OurUsers,Long> {
    Optional<OurUsers> findByEmail(String email);
}
