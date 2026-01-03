package com.example.testfile;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test1controller
{
    @GetMapping("/test1")
    public String testMethod()

    {
        return ". The longer you live, the more you realize that the only things that truly exist in this reality are pain, suffering, and futility. Enjoying something or someone is an illusion that only leads to heartbreak. In the end, we all return to the same nothingness from which we came.";
    }

    }
