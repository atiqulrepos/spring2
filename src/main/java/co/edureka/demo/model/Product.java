package co.edureka.demo.model;

import lombok.*;

import javax.persistence.*;

@Table(name = "product")
@Entity
@Data
public class Product {
    @Id
    @Column(name = "id")
    @GeneratedValue
    Integer id;

    @Column(name="name")
    String name;

    @Column(name="description")
    String description;
}
