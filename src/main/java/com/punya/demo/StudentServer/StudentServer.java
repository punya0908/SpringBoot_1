package com.punya.demo.StudentServer;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // for incoming http request, it helps to listen to them
public class StudentServer {
//    @PostMapping("/create")
//    public String storeStudent(@RequestBody Student student) {
//        int id = student.getId();
//        String name = student.getName();
//        String department = student.getDepartment();
//        int age = student.getAge();
//
//        return "id: " + id +
//                ", name: " + name +
//                ", department: " + department +
//                ", age: " + age;
//    }
}
