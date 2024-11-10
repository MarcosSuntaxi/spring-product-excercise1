package com.uce.product.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uce.product.Model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
