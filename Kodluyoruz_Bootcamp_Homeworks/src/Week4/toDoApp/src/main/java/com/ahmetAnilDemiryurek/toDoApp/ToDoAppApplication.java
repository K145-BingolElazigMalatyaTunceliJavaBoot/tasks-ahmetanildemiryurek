package com.ahmetAnilDemiryurek.toDoApp;

import com.ahmetAnilDemiryurek.toDoApp.TodoList.TodoList;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@SpringBootApplication
public class ToDoAppApplication {

	public static List<TodoList> daysList = new CopyOnWriteArrayList<>();

	@PostConstruct
	public void fillToDoList(){

		TodoList day1 = new TodoList();
		day1.setId(1);
		day1.setDay("Pazartesi");
		day1.setContent(" Java - API Calisilacak ! ");
		day1.setDone(true);


		TodoList day2 = new TodoList();
		day2.setId(2);
		day2.setDay("Sali");
		day2.setContent("Biyomedikal Muhendisligi proje icin Python Ogrenilecek");
		day2.setDone(true);


		TodoList day3 = new TodoList();
		day3.setId(3);
		day3.setDay("Carsamba");
		day3.setContent("alışverişe çıkma");
		day3.setDone(false);


		TodoList day4 = new TodoList();
		day4.setId(3);
		day4.setDay("Persembe");
		day4.setContent("alışverişe çıkma");
		day4.setDone(false);


		TodoList day5 = new TodoList();
		day5.setId(3);
		day5.setDay("Cuma");
		day5.setContent("alışverişe çıkma");
		day5.setDone(false);


		TodoList day6 = new TodoList();
		day6.setId(3);
		day6.setDay("Cumartesi");
		day6.setContent("alışverişe çıkma");
		day6.setDone(false);


		TodoList day7 = new TodoList();
		day7.setId(3);
		day7.setDay("Pazar");
		day7.setContent("alışverişe çıkma");
		day7.setDone(false);



		daysList.add(day1);
		daysList.add(day2);
		daysList.add(day3);
		daysList.add(day4);
		daysList.add(day5);
		daysList.add(day6);
		daysList.add(day7);



	}


	}

