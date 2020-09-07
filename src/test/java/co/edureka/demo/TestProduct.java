package co.edureka.demo;

import co.edureka.demo.model.Product;
import co.edureka.demo.repository.ProductRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
public class TestProduct {
    @Autowired
    ProductRepository productRepository;

    @Test
    public void testProductSave(){
        //Given
        Product product = new Product();
        product.setName("Samsung Galaxy S20");
        product.setDescription("Samsung Galaxy S20 Gunmetal");

        //When
        Product savedProduct = productRepository.save(product);
        List<Product> all = productRepository.findAll();

        //Then
        Assertions.assertThat(savedProduct).isNotNull();
        Assertions.assertThat(all.stream().findFirst().get()).isEqualTo(product);
    }

}
