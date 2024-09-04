package com.Project.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Project.demo.Entity.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
