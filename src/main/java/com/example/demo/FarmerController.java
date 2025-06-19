package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class FarmerController {

    /** echo "# github-actions" >> README.md
    * git init
    * git add README.md
    * git commit -m "first commit"
    * git branch -M main
    * git remote add origin https://github.com/Priyanshu209048/github-actions.git
    * git push -u origin main
     */

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello from FarmEasy API!";
    }

}
