package ru.antongrutsin.spring_hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.antongrutsin.spring_hibernate.model.Product;
import ru.antongrutsin.spring_hibernate.model.User;
import ru.antongrutsin.spring_hibernate.repository.ProductsDAO;
import ru.antongrutsin.spring_hibernate.repository.UserDAO;

import java.util.List;

@Service
public class Serv {
    private ProductsDAO productsDAO;
    private UserDAO userDAO;

    @Autowired
    public Serv(ProductsDAO productsDAO, UserDAO userDAO) {
        this.productsDAO = productsDAO;
        this.userDAO = userDAO;
    }

    public List<Product> getUserProducts(int id){
        User user = userDAO.getUser(id);
        return user.getProducts();
    }
}
