package org.example.Homework6.controller;


import org.example.Homework6.data.User;

public interface UserController<T extends User>{
    void create(String firstName, String secondName, String patronymic, String dateOfBirth);
}
