package com.punya.demo.StudentServer;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentServer {
    @PostMapping("/create")
    public String storeStudent(){
        return """
                id: 1
                name: Punya
                department: CSE
                age: 21
                """;
    }
}
