package org.example.Homework4.controller;


import org.example.Homework4.data.User;

public interface UserController<T extends User>{
    void create(String firstName, String secondName, String patronymic, String dateOfBirth);
}
