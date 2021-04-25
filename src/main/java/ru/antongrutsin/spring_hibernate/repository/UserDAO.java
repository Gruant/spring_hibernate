package ru.antongrutsin.spring_hibernate.repository;

import ru.antongrutsin.spring_hibernate.model.User;

public interface UserDAO{
    User getUser(int id);
}
