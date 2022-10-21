package com.ahmetAnilDemiryurek.toDoApp.TodoList;

public class TodoList {
    int id;
    String day;

    String content;
    boolean done;

    public TodoList(){

    }

    public TodoList(String day , int id, String content , boolean done){
        this.id=id;
        this.day=day;
        this.content=content;
        this.done=done;

    }
    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getDay() {

        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

}