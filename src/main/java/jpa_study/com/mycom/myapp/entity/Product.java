package jpa_study.com.mycom.myapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Product {

    @Id
    private Long id;
    private String name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
