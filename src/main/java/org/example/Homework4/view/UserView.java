package org.example.Homework4.view;


import org.example.Homework4.data.User;

import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);

}
