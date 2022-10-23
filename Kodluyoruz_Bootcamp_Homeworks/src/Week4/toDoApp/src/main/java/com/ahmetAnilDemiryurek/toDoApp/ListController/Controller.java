package com.ahmetAnilDemiryurek.toDoApp.ListController;

import com.ahmetAnilDemiryurek.toDoApp.Request.TodoListSaveRequest;
import com.ahmetAnilDemiryurek.toDoApp.Service.TodoListService;
import com.ahmetAnilDemiryurek.toDoApp.TodoList.TodoList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/list")
public class Controller {

    @Autowired
    TodoListService listService;

    @GetMapping("/getList")
    public TodoList getTodoList(@RequestParam(value = "listId", required = false) int listId){
        return TodoListService.getTodoList(listId);

    }

    @PostMapping("/saveList")
    public boolean saveToDoList(@RequestBody TodoListSaveRequest listSaveRequestBody){
        return listService.saveList(listSaveRequestBody);

    }

    @DeleteMapping("/deleteList")
    public boolean updateToDoList(@RequestParam int listeId){
        return listService.deleteList(listeId);

    }
}