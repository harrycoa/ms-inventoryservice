package com.pe.appventas.msinventoryservice.repositories;

import com.pe.appventas.msinventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    public Optional<Product> findBySku(String sku);
}
