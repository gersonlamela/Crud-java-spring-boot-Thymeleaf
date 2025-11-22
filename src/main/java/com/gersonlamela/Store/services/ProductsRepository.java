package com.gersonlamela.Store.services;

import com.gersonlamela.Store.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Integer> {
}
