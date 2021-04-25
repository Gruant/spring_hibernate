package ru.antongrutsin.spring_hibernate.repository;

import org.springframework.stereotype.Repository;
import ru.antongrutsin.spring_hibernate.model.Product;

import javax.persistence.EntityManager;

@Repository
public class ProductsDAOImp implements ProductsDAO{

    private final EntityManager entityManager;

    public ProductsDAOImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Product getProduct(int id){
        return entityManager.find(Product.class, id);
    }
}
