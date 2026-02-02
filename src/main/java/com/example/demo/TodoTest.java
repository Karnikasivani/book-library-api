package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
public class TodoTest {
    static private List<Todo> listOfTodo = new ArrayList<>();

    @PostMapping("/action")
    public String testDesc(@RequestBody List<Todo> todos) {
        boolean added = true;
        String duplicateTime = "";
        for(Todo todo : todos) {
            boolean exist = listOfTodo.stream().anyMatch(listTodo -> listTodo.getTime().equals(todo.getTime()));
            if(!exist) {
                added = listOfTodo.add(todo);
            }
            else {
                added = false;
                duplicateTime = todo.getTime();
            }
            if (!added) break;
        }
        System.out.println(listOfTodo);
        if(added) {return "INSERTED SUCCESFULLY";}
        else return "Duplicate entry for time: " + duplicateTime;
    }

    //Get all actions wrt time
    @GetMapping("/action")
    public List<Todo>  testDesc1() {
        return listOfTodo;
    }

    //Get action by time
    @GetMapping("/action/{time}")
    public Todo testDesc2(@PathVariable String time) {
//        System.out.println(time);
        for(Todo todo : listOfTodo) {
            System.out.println(todo.getTime());
            if(todo.getTime().equals(time)) {
                return todo;
            }
        }
        System.out.println("No action exist for mentioned time");
        return null;
    }
}
