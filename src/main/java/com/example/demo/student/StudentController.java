package com.example.demo.student;

import java.util.*;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController
{
    private final StudentService studentService;

    public StudentController(StudentService studentService)
    {
        this.studentService = studentService;
    }

	@GetMapping
    public List<Student> getStudents()
	{
        return this.studentService.getStudents();
    }

}
