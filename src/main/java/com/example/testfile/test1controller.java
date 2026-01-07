package com.example.testfile;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test1controller
{
    @GetMapping("/test1")
    public String testMethod()

    {
        return "Do it  for Yourself";
    }
  
    }
