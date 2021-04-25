package ru.antongrutsin.spring_hibernate.repository;

import org.springframework.stereotype.Repository;
import ru.antongrutsin.spring_hibernate.model.User;

import javax.persistence.EntityManager;

@Repository
public class UserDAOImp implements UserDAO{

    private final EntityManager entityManager;

    public UserDAOImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public User getUser(int id){
        return entityManager.find(User.class, id);
    }
}
