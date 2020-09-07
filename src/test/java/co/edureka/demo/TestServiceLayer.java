package co.edureka.demo;

import co.edureka.demo.model.Product;
import co.edureka.demo.service.ProductService;
import org.assertj.core.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

public class TestServiceLayer {
    @Autowired
    ProductService productService;
    public void testService(){

        //Given
        Product product = new Product();
        product.setName("Samsung Galaxy S20");
        product.setDescription("Samsung Galaxy S20 Gunmetal");

        //When
        productService.save(product);

        //Then
        Assertions.assertThat(productService.isExists("Samsung Galaxy S20"));


    }
}
