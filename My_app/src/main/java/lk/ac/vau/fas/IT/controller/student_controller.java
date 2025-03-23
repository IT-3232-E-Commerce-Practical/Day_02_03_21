package lk.ac.vau.fas.IT.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class student_controller {

    @GetMapping("/name")
    public String name() {
        return "My name is Tharindu";
    }

    @GetMapping("/reg")
    public String getReg() {
        return "2020ICT007";
    }

    @GetMapping("/age")
    public Integer getAge() {
        return 24;
    }
}