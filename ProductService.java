package com.yazhini.smartcart.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yazhini.smartcart.entity.Product;
import com.yazhini.smartcart.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repo;

    public Product addProduct(Product product) {
        return repo.save(product);
    }

    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Product getProductById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Product updateProduct(Long id, Product product) {
        Product existing = repo.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(product.getName());
            existing.setPrice(product.getPrice());
            existing.setQuantity(product.getQuantity());
            return repo.save(existing);
        }
        return null;
    }

    public void deleteProduct(Long id) {
        repo.deleteById(id);
    }
}
