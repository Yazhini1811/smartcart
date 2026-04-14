package com.yazhini.smartcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.yazhini.smartcart.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
