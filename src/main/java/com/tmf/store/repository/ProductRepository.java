package com.tmf.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tmf.store.entites.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{

}
