package com.chedi.Projet_Rest.repository;

import com.chedi.Projet_Rest.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface categoryRepository extends JpaRepository<Category,Integer> {
}
