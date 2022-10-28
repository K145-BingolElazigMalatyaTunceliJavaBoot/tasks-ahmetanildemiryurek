package com.ahmetAnilDemiryurek.toDoApp.Service;


import java.util.Random;
import com.ahmetAnilDemiryurek.toDoApp.Request.TodoListSaveRequest;
import java.util.Iterator;
import java.util.List;
import com.ahmetAnilDemiryurek.toDoApp.ToDoAppApplication;
import com.ahmetAnilDemiryurek.toDoApp.TodoList.TodoList;
import org.springframework.stereotype.Service;


@Service
public class TodoListService
{
    public static TodoList getTodoList(final int listId) {
        final List<TodoList> List = (List<TodoList>)ToDoAppApplication.daysList;
        for (final TodoList value : List) {
            if (value.getId() == listId) {
                return value;
            }
        }
        return null;
    }
    public boolean saveList(TodoListSaveRequest requestBody) {
        String listName = requestBody.getDay();

        try {
            TodoList list = new TodoList();
            list.setDay(listName);
            int id = getId();
            list.setId(id);

            List<TodoList> List = ToDoAppApplication.daysList;
            List.add(list);

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private int getId() {
        Random random = new Random();
        int id = random.nextInt(1500);
        return id;
    }

    public boolean deleteList(final int listeId) {
        try {
            List<TodoList> List = ToDoAppApplication.daysList;
            for (TodoList value : List) {
                if (value.getId() == listeId) {
                    List.remove(value);
                }
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
