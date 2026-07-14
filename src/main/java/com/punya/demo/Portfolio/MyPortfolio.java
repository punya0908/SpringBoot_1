package com.punya.demo.Portfolio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyPortfolio {
    @GetMapping("/myself")
    public String myself(){
        return """
                <h1>Punya Mohun</h1>
                <p>Stark Industries</p>
                """;
    }

    @GetMapping("/Skills")
    public String skills(){
        return """
                <h1>Skills</h1>
                <ul>
                <li> github: punya0908</li>
                </ul>
                """;
    }

    @GetMapping("/edu")
    public String edu(){
        return """
                <h1>Edu</h1>
                <p>MGN public school</p>
        """;
    }

    @GetMapping("/projects")
    public String projects(){
        return """
                <h1>Projects</h1>
                <ul>
                <li>OrderFlow</li>
                <li>IntelliHR</li>
                </ul>
        """;
    }
}
