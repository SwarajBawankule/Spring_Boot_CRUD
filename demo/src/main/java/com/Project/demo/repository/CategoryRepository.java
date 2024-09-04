package com.Project.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Project.demo.Entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}

