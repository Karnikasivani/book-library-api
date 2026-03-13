package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class Test {
    @GetMapping("/test1")
    public String func(){
        return "Test1";
    }

    @GetMapping("/test2")
    public String func1() {
        return "Test2";
    }

    @GetMapping("/sum")
    public int sum(@RequestParam int a, @RequestParam int b){
        return a+b;
        //http://localhost:8080/sum?a=80&b=4
    }

    @GetMapping("/{a}/sub/{b}")
    public int sub(@PathVariable int a, @PathVariable int b) {
        return a-b;
        //http://localhost:8080/70/sub/7
    }

    @GetMapping("/mul/{b}")
    public int mul(@RequestParam int a, @PathVariable int b) {
        return a*b;
        //http://localhost:8080/mul/6?a=7
    }

    @PostMapping("/login")
    public String login(@RequestBody Login login){
        if(login.username.equals("Vignesh") && login.password.equals("Karnika")) {
            return "SUCCESSFUL";
        }
        return "FUCK OFF!";
    }
//
//    @PostMapping("/action")
//    public String action(@RequestBody Todo TODO) {
//        if(Todo.id == 1) {
//            return "ID SUCCESSFUL";
//        }
//        return "FAILED";
//    }
//TODO.description.equals("This is an entry") && TODO.entryTime.equals("11:00")
}
