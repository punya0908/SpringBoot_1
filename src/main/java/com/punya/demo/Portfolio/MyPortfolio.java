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
    public String getSkills(){
        return """
                <h1>Skills</h1>
                <ul>
                <li> github: punya0908</li>
                </ul>
                """;
    }

    @GetMapping("/edu")
    public String getEducation(){
        return """
                <h1>Edu</h1>
                <p>MGN public school</p>
        """;
    }

    @GetMapping("/projects")
    public String getProjects(){
        return """
                <h1>Projects</h1>
                <ul>
                <li>OrderFlow</li>
                <li>IntelliHR</li>
                </ul>
        """;
    }

    @GetMapping("/contact")
    public String getContact(){
        return """
                <h1>Contact</h1>
                <p>7355543230</p>
        """;
    }
}
