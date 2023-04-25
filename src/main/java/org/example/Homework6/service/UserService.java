package org.example.Homework6.service;

import java.util.List;

public interface UserService<T> {
    List<T> getAll();

    void create(String firstName, String secondName, String patronymic, String dateOfBirth);
    public Long getId(T user);
    public Long getMaxId();

    public default Long getMaxId(List<T> users){
        Long countMaxId = 0L;
        for (T user: users){
            if (getId(user) > countMaxId){
                countMaxId = getId(user);
            }
        }
        return countMaxId;
    }
}
