package co.edureka.demo.service;

import co.edureka.demo.model.Product;
import co.edureka.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public boolean save(Product product){
        productRepository.save(product);
        return true;
    }

    public boolean isExists(String name){
        Optional<Product> byName = productRepository.findByName(name);
        return byName.isPresent();
    }
}
