package com.chedi.Projet_Rest.repository;

import com.chedi.Projet_Rest.model.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends JpaRepository<user,Integer> {

    user findByEmail(String email);
}
