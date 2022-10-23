package com.ahmetAnilDemiryurek.toDoApp.Service;

import com.ahmetAnilDemiryurek.toDoApp.Request.TodoListSaveRequest;
import com.ahmetAnilDemiryurek.toDoApp.ToDoAppApplication;
import com.ahmetAnilDemiryurek.toDoApp.TodoList.TodoList;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Random;

@Service
public class TodoListService {
    public static TodoList getTodoList(int listId) {
        List<TodoList> List = ToDoAppApplication.daysList;
        for (TodoList value : List) {
            if (value.getId() == listId) {
                return value;
            }
        }
        return null;
    }

    public boolean saveList(TodoListSaveRequest requestBody) {
        String listName = requestBody.getDay();


        TodoList list = new TodoList();
        list.setDay(listName);
        int id = getId();
        list.setId(id);

        List<TodoList> List = ToDoAppApplication.daysList;
        List.add(list);

        return true;
    }

    private int getId() {
        Random random = new Random();
        int id = random.nextInt(1000);
        return id;
    }


    public boolean deleteList(int listeId) {
        List<TodoList> List = ToDoAppApplication.daysList;
        for (TodoList deger : List) {
            if (deger.getId() == listeId) {
                List.remove(deger);
            }
        }
        return true;
    }
}
