package com.chedi.Projet_Rest.repository;

import com.chedi.Projet_Rest.model.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productRepository extends JpaRepository<product, Integer> {

   // product findByName(String name);

}
