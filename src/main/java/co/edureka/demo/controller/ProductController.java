package co.edureka.demo.controller;

import co.edureka.demo.model.Product;
import co.edureka.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(path="product")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping

    public ResponseEntity<Boolean> saved(Product product) throws ProductNotCreatedException {
        boolean saved = productService.save(product);
        if (saved) {
            return ResponseEntity.status(HttpStatus.CREATED).body(saved);
        } else {
            throw new ProductNotCreatedException();
        }
    }
}
