package org.example.Homework6.view;


import org.example.Homework6.data.User;

import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);

}
